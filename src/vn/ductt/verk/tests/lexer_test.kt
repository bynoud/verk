package vn.ductt.verk.tests

import org.antlr.v4.runtime.*
import vn.ductt.verk.parser.*
import vn.ductt.verk.prepr.*
import java.util.logging.Level
import java.util.logging.LogManager

fun main() {
    val rootLogger = LogManager.getLogManager().getLogger("");
    rootLogger.level = Level.FINE
    for (h in rootLogger.handlers) {
        h.level = Level.FINE
    }

    val verstring = """
        `define A 3
        `define ASS(x, y) assign // a comment \
            x = y[`A] ; // end comment
        module modname ( input [`A:1]in1, output out2 );
//          assign in2 = in1[2];
          `ASS(out2, in1)
        endmodule
    """.trimIndent()

    val golden = listOf<Any>(
        "module", SystemVerilogLexer.Module_keyword_only,
        "modname", SystemVerilogLexer.Simple_identifier,
        "(", SystemVerilogLexer.Open_parenthesis,
        "input", SystemVerilogLexer.Input,
        "[", SystemVerilogLexer.Left_bracket,
        "3", SystemVerilogLexer.Decimal_number,
        ":", SystemVerilogLexer.Colon,
        "1", SystemVerilogLexer.Decimal_number,
        "]", SystemVerilogLexer.Right_bracket,
        "in1", SystemVerilogLexer.Simple_identifier,
        ",", SystemVerilogLexer.Comma,
        "output", SystemVerilogLexer.Output,
        "out2", SystemVerilogLexer.Simple_identifier,
        ")", SystemVerilogLexer.Close_parenthesis,
        ";", SystemVerilogLexer.Semicolon,
        "assign", SystemVerilogLexer.Assign,
        "out2", SystemVerilogLexer.Simple_identifier,
        "=", SystemVerilogLexer.Equal,
        "in1", SystemVerilogLexer.Simple_identifier,
        "[", SystemVerilogLexer.Left_bracket,
        "3", SystemVerilogLexer.Decimal_number,
        "]", SystemVerilogLexer.Right_bracket,
        ";", SystemVerilogLexer.Semicolon,
        "endmodule", SystemVerilogLexer.Endmodule,
        "<EOF>", SystemVerilogLexer.EOF
    )

    val chars = CharStreams.fromString(verstring)
//    val chars = PreprStream(verstring)
    val lexer = PreprLexer(chars)
    val tokens = CommonTokenStream(lexer)
    tokens.fill()
    val vocal = SystemVerilogLexer.VOCABULARY

    var gi = 0
    var errCnt = 0
    for (tok in tokens.tokens) {
//        print("Token '${tok.text}' (${tok.channel} - ${vocal.getSymbolicName(tok.type)})\n")
        if (tok.text != golden[gi] || tok.type != golden[gi+1]) {
            print("ERROR: [$gi] '${tok.text}' <${tok.type}> -- ${golden[gi]} <${golden[gi+1]}>\n")
            errCnt++
        }
        gi+=2
    }
    if (errCnt==0) print("Test passed\n")
    else print("Test FAILED\n\n")
}

