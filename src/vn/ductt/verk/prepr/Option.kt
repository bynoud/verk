package vn.ductt.verk.prepr

import com.sun.org.apache.xpath.internal.operations.Bool
import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body
import vn.ductt.verk.errors.VerilogError
import vn.ductt.verk.helper.Loggable
import vn.ductt.verk.helper.OrderedMap
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.logging.Logger


class Option(optionString: String = ""): Loggable {
    override val LOG = logger()

    private val defines = hashMapOf<String, Define>()
    private val files = OrderedMap<VerilogFile>()
    private val processedfiles = OrderedMap<VerilogFile>()
    private val incDirs = OrderedMap<VerilogPath>()
    private val libFiles = OrderedMap<VerilogFile>()
    private val libDirs = OrderedMap<VerilogPath>()
    private val libExts = mutableListOf<String>()

    // parsing option array
    fun parseOption(opts: List<String>, relTo: String = "") {
        var id = 0
        val nextOpt: (must: Boolean) -> String = {
            when {
                id < opts.size -> opts[id++]
                it -> throw OptionError("Missing argument after ${opts[id]}")
                else -> ""
            }
        }
        while (id < opts.size) {
            var o = nextOpt(false)
            when (o) {
                "-v" -> addLibFile(nextOpt(true), relTo)
                "-y" -> addLibDir(nextOpt(true), relTo)
                "-f", "-F" -> parseOptionFile(nextOpt(true), relTo, o=="-F")
                // FIXME : continue
            }
        }
    }

    fun parseOptionFile(filename: String, relTo: String = "", relToThisFile: Boolean = false) {

    }

    // Files/Folders
    fun addFile(name: String, relTo: String = "") {
        val f = VerilogFile(name, relTo)
        files.set(f.absPath, f)
    }

    fun addLibFile(name: String, relTo: String = "") {
        val f = VerilogFile(name, relTo)
        libFiles.set(f.absPath, f)
    }

    fun addIncDir(name: String, relTo: String = "") {
        val f = VerilogPath(name, relTo)
        libDirs.set(f.absPath, f)
    }

    fun addLibDir(name: String, relTo: String = "") {
        val f = VerilogPath(name, relTo)
        incDirs.set(f.absPath, f)
    }

    fun addLibExt(ext: String) {
        if (ext !in libExts) libExts.add(ext)
    }

    fun findIncFile(name: String): String {
        for (d in incDirs) {
            if (d.hasChildPath(name)) return "${d.absPath}/$name"
        }
        return ""
    }

    fun findLibFile(name: String): String {
        val names = libExts.map { e -> "$name.$e" }
        for (f in libFiles) {
            if (f.myName in names) return f.absPath
        }
        for (d in libDirs) {
            for (n in names) {
                if (d.hasChildPath(n)) return "${d.absPath}/$n"
            }
        }
        return ""
    }

    fun nextPendingFile(): String {
        val f = files.pop() ?: return ""
        processedfiles.set(f.absPath, f)
        return f.absPath
    }

    // defines
    fun getDefine(name: String): Define? = defines[name]
    fun hasDefine(name: String): Boolean = defines.containsKey(name)
    fun newDefine(name: String): Define {
        val d = Define(name)
        addDefine(d)
        return d
    }
    private fun addDefine(define: Define) {
        val name = define.name
        if (define.compare(defines[name])) warn("Redefined `define $name")
        defines[name] = define
        debug("New $define")
    }
    fun delDefine(name: String) {
        defines.remove(name)
    }
    fun delAllDefines() = defines.clear()


    class Define(val name: String): Loggable {
        override val LOG = logger()
        private val args = Argument()
        private var latestArg: String = ""
        private val body = mutableListOf<BodyType>()

        val argSize: Int get() = args.size

        fun setArg(arg: String, default: String? = null) {
            args.set(arg, default)
            latestArg = arg
        }

        fun addChar(t: String) = body.add(BodyType(t))
        fun addNewline() = addChar("\n")
        fun addEscaped(t: String) = addChar(t.removePrefix("`"))
        fun addId(t: String) {
            val id = args.indexOf(t)
            if (id<0) addChar(t)
            else body.add(BodyType(t, id))
        }

        fun appendArgDefault(text: String) = args.append(latestArg, text)

        fun substitute(actualArgs: List<String?>): String {
            debug("expand '$name ($args)' = '${body.joinToString(separator="", transform = {it.text})}' with <$actualArgs>")
            val selArgs = mutableListOf<String>()
            for (ind in 0 until args.size) {
                val a = if (ind < actualArgs.size) actualArgs[ind] ?: args.require(ind) else args.require(ind)
                selArgs.add(a)
            }
            var exp = ""
            for (b in body) exp += if (b.argInd < 0) b.text else selArgs[b.argInd]
            return exp
        }

        fun compare(o: Define?): Boolean = o?.body == body

        override fun toString(): String = "<Define '$name' ($args) = $body>"

        private class BodyType(val text: String, val argInd: Int = -1)

        private class Argument {
            private val iNames = mutableListOf<String>()
            private val iDefaults = mutableListOf<String?>()

            val size: Int get() = iNames.size

            fun set(name: String, default: String?) {
                val id = indexOf(name)
                if (id < 0) {
                    iNames.add(name)
                    iDefaults.add(default)
                }
                else {
                    iDefaults[id] = default
                }
            }

            fun append(name: String, default: String) {
                val id = indexOf(name)
                assert (id>=0)
                iDefaults[id] = (iDefaults[id] ?: "") + default
            }

            fun get(ind: Int): String? = if (ind in 0 until size) iDefaults[ind] else null
            fun get(name: String): String? = get(indexOf(name))
            fun require(ind: Int): String {
                return get(ind) ?: throw VerilogError("Argument '${nameAt(ind)}' don\'t have default value")
            }

            fun indexOf(name: String): Int = iNames.indexOf(name)
            fun nameAt(ind: Int): String? = if (ind in 0 until size) iNames[ind] else null
            fun contains(name: String) = indexOf(name) >= 0

//            fun expandDefault(ind: Int, define: Define): String {
//                if (ind >= size) throw VerilogError("Argument '${nameAt(ind)}' don\'t have default value")
//                var exp = ""
//                for (default in iDefaults) {
//                    default.forEach { t ->
//                        if (!t.isMacroCall) {
//                            exp += t.text
//                        } else {
//
//                        }
//                    }
//                }
//            }

//
//            override fun toString(): String {
//                var r = ""
//                iNames.forEachIndexed {i,v -> r += "$v = ${iDefaults[i]},"}
//                return r
//            }
//
//            private class ArgType(val text: String, val isMacroCall: Boolean)
//            private class ArgDefault(text: String?, isMacroCall: Boolean = false) {
//                private val items = mutableListOf<ArgType>()
//                init {
//                    if (text != null) items.add(ArgType(text, isMacroCall))
//                }
//                fun add(text: String) {
//                    if (text.startsWith("`")) items.add(ArgType(text.removePrefix("`"), true))
//                    else items.add(ArgType(text, false))
//                }
//                fun forEach(fn: (v: ArgType) -> Any) {
//                    for (i in items) fn(i)
//                }
//                fun expand(define: Define) {
//                    var exp = ""
//                    for (i in items) {
//                        if (i.isMacroCall) {
//                            if (define.)
//                        } else {
//                            exp += i.text
//                        }
//                    }
//                }
//
//            }
        }
    }



    private open class VerilogPath(val name: String, relTo: String) {
        val path: Path = Paths.get(if (relTo == "") name else "$relTo/$name")
        val absPath: String = path.toAbsolutePath().toString()
        val myName: String = path.fileName.toString()
        fun hasChildPath(name: String) = Files.isReadable(Paths.get(absPath, name))
    }

    private class VerilogFile(name: String, relTo: String): VerilogPath(name, relTo) {
        var parsed = false
        val modules = mutableListOf<Any>() // FIXME: change to list of Module
    }

    class OptionError(msg: String): VerilogError(msg) {}
}