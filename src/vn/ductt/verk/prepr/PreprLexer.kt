package vn.ductt.verk.prepr

import org.antlr.v4.runtime.*
import vn.ductt.verk.errors.LexerSyntaxError
import vn.ductt.verk.errors.VerilogError
import vn.ductt.verk.helper.Loggable
import vn.ductt.verk.parser.SystemVerilogLexer

// add removeLast function
fun <E> MutableList<E>.removeLast(): E {
    return this.removeAt(this.size-1)
}


class PreprLexer(input: CharStream, option: Option? = null, upSrc: TokenSource? = null) :
    PreprTokens(SystemVerilogLexer(input)), Loggable {
    override val LOG = logger()
    private val opt: Option = option ?: Option()

    private val vocals = SystemVerilogLexer.VOCABULARY

    private lateinit var curTok: Token
    private var context = ""    // save context from last newline

    private val directExpandStack = mutableListOf<String>() // prevent directive expand to itself

    private val condDirective = CondDirective(opt)
    private var condDirectSkip = false // cached version of condDirective.skipped

    private val curTokName: String get() = vocals.getDisplayName(curTok.type)

    // return next Token, include blank . Call this if you want to keep blank
    private fun allToken() {
        curTok = source.nextToken()
        verbose("tok '${curTok.text}' <$curTokName:${curTok.channel}>\n")
        when (curTok.type) {
            SystemVerilogLexer.New_line,
            SystemVerilogLexer.One_line_comment,
            SystemVerilogLexer.Define_new_line,
            SystemVerilogLexer.Define_comment_continue,
            SystemVerilogLexer.Define_comment_end -> context = ""
            else -> context += curTok.text
        }
//        context = if (curTok.type == SystemVerilogLexer.New_line) "" else context + curTok.text
    }

    // call this to strip out blank space, for easy to handle
    private fun noHiddenToken() {
        do {
            allToken()
        } while (curTok.channel == Lexer.HIDDEN)
    }

    // call this if you expected a directive could involved
    override fun nextToken(): Token {
        noHiddenToken()
        while (isSkipToken()) noHiddenToken()
        return curTok
    }

    // return false to return this current token, true to get next
    private fun isSkipToken(): Boolean {
        // conditional first to decide need to follow this token or not
        if (condDirectSkip && curTok.type != SystemVerilogLexer.Directive_conditional)
            return true

        var skip = true
        when (curTok.type) {
            // save context from last saw newline. Skip newline/whitespace
            SystemVerilogLexer.New_line -> context = ""
            SystemVerilogLexer.WHITE_SPACE -> { /* just skip */ }

            // current parser support: timescale, library, default_nettype, line
            // there's already parser rule for this. Just ignore it on Parser
            SystemVerilogLexer.Tick_timescale,
            SystemVerilogLexer.Line_directive,
            SystemVerilogLexer.Default_nettype,
            SystemVerilogLexer.Library -> skip = false

            SystemVerilogLexer.Directive_define -> dirDefine()
            SystemVerilogLexer.Directive_include -> dirInclude()
            SystemVerilogLexer.Directive_undef -> dirUndef()
            SystemVerilogLexer.Directive_undefineall -> dirUndef(true)
            SystemVerilogLexer.Directive_conditional -> dirCondition()
            SystemVerilogLexer.Directive_FILELINE -> { skip = false } // dont support, just return as it is

            SystemVerilogLexer.Verilog_directive -> expandDirective()

            // hit EOF, return to previous source if any
            Token.EOF -> if (!upStream()) skip = false // no more upStream, this is the end

            // Error
            SystemVerilogLexer.Error_char -> throw PreprError("Unexpected token")

            else -> skip = false
        }

        return skip
    }

    // FIXME : Support `include < filename >
    private fun dirInclude() {
        nextToken() // it's could be macro
        if (curTok.type != SystemVerilogLexer.String_literal) {
            throw PreprError("Include directive must followed by a String")
        }
        // TODO : the filename need to be lookup again Option
        toIncludeStream(curTok.text)
    }

    private fun dirDefine() {
        // `define <name>
        noHiddenToken()
        if (curTok.type != SystemVerilogLexer.Define_identifier) throw PreprError()
        val define = opt.newDefine(curTok.text)

        // body parse
        var argDeep = 0

        noHiddenToken()
        var state = when (curTok.type) {
            SystemVerilogLexer.Define_new_line,
            SystemVerilogLexer.Define_comment_end -> DefineState.NAME
            SystemVerilogLexer.Define_open_parent -> {
                noHiddenToken()
                DefineState.ARGUMENTS
            }
            else -> DefineState.BODY
        }

        if (state != DefineState.NAME) {
            while (true) {
                debug("define '${define.name} - $state - ${curTok.text} <$curTokName>")

                // end of define
                if (curTok.type == SystemVerilogLexer.Define_new_line ||
                    curTok.type == SystemVerilogLexer.Define_comment_end
                ) {
                    if (state != DefineState.BODY) throw PreprError()
                    break
                }


                when (state) {

                    DefineState.ARGUMENTS -> {
                        // (arg_name [ = [default] ]), 'default' could be anything, except escaped identifier
                        // can include ()[]{} as long as it paired. can include string
                        state = when (curTok.type) {
                            SystemVerilogLexer.Define_close_parent -> {
                                DefineState.BODY
                            }
                            SystemVerilogLexer.Define_identifier -> {
                                define.setArg(curTok.text)
                                DefineState.ARG_NAME
                            }
                            else -> throw PreprError()
                        }
                    }

                    DefineState.ARG_NAME -> {
                        state = when (curTok.type) {
                            SystemVerilogLexer.Define_equal -> {
                                define.appendArgDefault("")
                                DefineState.ARG_DEFAULT
                            }
                            SystemVerilogLexer.Define_comma -> {
                                DefineState.ARGUMENTS
                            }
                            SystemVerilogLexer.Define_close_parent -> {
                                DefineState.BODY
                            }
                            else -> throw PreprError()
                        }
                    }

                    DefineState.ARG_DEFAULT -> {
                        if (curTok.type == SystemVerilogLexer.Define_close_parent && argDeep == 0) {
                            state = DefineState.BODY
                        } else if (curTok.type == SystemVerilogLexer.Define_comma) {
                            state = DefineState.ARGUMENTS
                        } else {
                            define.appendArgDefault(curTok.text)
                            when (curTok.type) {
                                SystemVerilogLexer.Define_close_parent, SystemVerilogLexer.Define_close_bracket -> argDeep--
                                SystemVerilogLexer.Define_open_parent, SystemVerilogLexer.Define_open_bracket -> argDeep++
                            }
                            if (argDeep < 0) throw PreprError()
                        }
                    }

                    else -> {  // BODY
                        val text = curTok.text
                        when (curTok.type) {
                            SystemVerilogLexer.Define_identifier -> define.addId(text)
                            SystemVerilogLexer.Define_escaped_char -> define.addEscaped(text)
                            SystemVerilogLexer.Define_escaped_newline -> define.addNewline()
                            else -> define.addChar(text)
                        }
                    }
                } // when (state)

                // if inside BODY or ARG_DEFAULT, get all blank space
                if (state == DefineState.BODY || state == DefineState.ARG_DEFAULT) allToken()
                else noHiddenToken() // Don't call nextToken, it'll expand macro. if there's macro call, save it & expand later

            } // while(true) - define tokens
        } // state != NAME

    }

    private fun dirUndef(all: Boolean = false) {
        if (all) {
            opt.delAllDefines()
        }
        else {
            noHiddenToken() // must be identifier
            if (curTok.type != SystemVerilogLexer.Simple_identifier) throw PreprError()
            opt.delDefine(curTok.text)
        }
    }

    private fun dirCondition() {
        val kw = curTok.text

        if (kw == "`ifdef" || kw == "`ifndef" || kw == "`elsif") {
            nextToken() // could be macro
            if (curTok.type != SystemVerilogLexer.Simple_identifier) throw PreprError()
        }
        if ((kw == "`endif" || kw == "`else" || kw == "`elsif") && condDirective.isEmpty)
            throw PreprError("Unmatched directive")

        condDirective.newStatement(kw, curTok.text)
        condDirectSkip = condDirective.skipped
    }

    private fun expandDirective() {
        val id = curTok.text.removePrefix("`")
        val def = opt.getDefine(id) ?: throw PreprError("Undefined macro '$id'")
        val args = mutableListOf<String?>()

        if (def.argSize > 0) {
            // get argument
            var argDeep = 0
            var curArg = ""
            noHiddenToken() // could not directive
            if (curTok.type != SystemVerilogLexer.Open_parenthesis) throw PreprError()
            while (true) {
                nextToken() // could be directive
                // end of argument
                if (curTok.type == SystemVerilogLexer.Close_parenthesis && argDeep == 0) {
                    args.add(curArg)
                    break
                }

                if (curTok.type == SystemVerilogLexer.Comma && argDeep == 0) {
                    args.add(curArg)
                    curArg = ""
                    continue
                }

                curArg += curTok.text

                when (curTok.type) {
                    SystemVerilogLexer.Close_parenthesis,
                    SystemVerilogLexer.Right_curly_bracket,
                    SystemVerilogLexer.Right_bracket -> argDeep--

                    SystemVerilogLexer.Open_parenthesis,
                        SystemVerilogLexer.Left_curly_bracket,
                        SystemVerilogLexer.Left_bracket -> argDeep++
                }
                if (argDeep < 0) throw PreprError()
            }
        } // if (argSize > 0)

        toMacroStream(def, args)
    }

    private fun directExpandToItself(key: String): Boolean  = key in directExpandStack
    private fun toMacroStream(def: Option.Define, args: List<String?>) {
        val name = def.name
        val key = "M:$name"
        if (directExpandToItself(key)) throw PreprError("Macro '$name' is referencing itself")
        directExpandStack.add(key)

        val exStr = try {
            def.substitute(args)
        } catch (e: VerilogError) {
            throw PreprError("Failed to expand macro '$name': ${e.msg}")
        }
        val nextSrc = SystemVerilogLexer(CharStreams.fromString(exStr, "<expand macro '$name'>"))
        downStream(nextSrc)
        debug("switch Stream: $key")
    }

    private fun toIncludeStream(filename: String) {
        val key = "I:$filename"
        if (directExpandToItself(key)) throw PreprError("File '$filename' is including itself")
        directExpandStack.add(key)

        val nextSrc = SystemVerilogLexer(CharStreams.fromFileName(filename))
        downStream(nextSrc)
        debug("switch Stream: $key")
    }

    override fun upStream(): Boolean {
        if (!super.upStream()) return false
        directExpandStack.removeLast()
        return true
    }



    inner class PreprError(msg: String = "Unexpected token") : LexerSyntaxError(msg) {
        init {
            source.let {
                file = it.sourceName
                line = it.line
                pos = it.charPositionInLine
                token = curTok
                ctx = context
            }
            debug("error : Token '${curTok.text}' <${vocals.getSymbolicName(curTok.type)}>, file $file:$line\n$context\n")
        }
    }

    private enum class DefineState {
        NAME,
        ARGUMENTS,
        ARG_NAME,
        ARG_DEFAULT,
        BODY,
    }

    private class CondDirective(val opt: Option) {
        val sttms = mutableListOf<CondStatement>()

        fun newStatement(kw: String, directID: String) {
            if (kw == "`endif") {
                sttms.removeLast()
            }
            else {
                val found = opt.hasDefine(directID)
                when (kw) {
                    "`ifdef" -> sttms.add(CondStatement(found, sttms.lastOrNull()))
                    "`ifndef" -> sttms.add(CondStatement(!found, sttms.lastOrNull()))
                    "`elsif" -> sttms.last().newCond(found)
                    else /* `else */ -> sttms.last().newCond(true)
                }
            }
        }
        val skipped: Boolean get() = sttms.last().skipped
        val isEmpty: Boolean get() = sttms.size == 0

        private class CondStatement(hit: Boolean, outer: CondStatement?) {
            private val outerMatched = outer?.matched ?: true
            private val conds = mutableListOf(CondPrimitive(hit, outerMatched))

            val matched: Boolean get() = conds.last().matched
            val skipped: Boolean get() = conds.last().skipped
            fun newCond(hit: Boolean) = conds.add(CondPrimitive(hit, outerMatched, matched))
        }

        private class CondPrimitive(
            val hit: Boolean,
            val outerMatched: Boolean = true,
            val preMatched: Boolean = false) {
            val matched: Boolean get() = !preMatched && hit
            val skipped: Boolean get() = (!outerMatched || preMatched) || !matched
        }
    }


}
