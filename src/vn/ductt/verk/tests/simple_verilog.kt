package vn.ductt.verk.tests

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker
import vn.ductt.verk.parser.*;
import vn.ductt.verk.prepr.*

fun main() {
    val verstring = """
        module modname ( in1, out2 );
          input [3:1] in1;
          output out2;
          assign out2 = in1[2];
        endmodule
    """.trimIndent()
    val chars = CharStreams.fromString(verstring)
    val lexer = PreprLexer(chars)
    val tokens = CommonTokenStream(lexer)
    val parser = SystemVerilogParser(tokens)
    parser.buildParseTree = true;
    val tree = parser.source_text()
    val listener = EchoListener()
    ParseTreeWalker.DEFAULT.walk(listener, tree)
}

class EchoListener : SystemVerilogParserBaseListener() {
    override fun enterModule_declaration(ctx: SystemVerilogParser.Module_declarationContext) {
        print("M ${ctx.module_keyword().text} - ${ctx.module_identifier().text}\n")
//        ctx.module_interface().module_port_interface()?.list_of_interface_ports()?.also {
//            print("List of Ports\n")
//            for (pctx in it.port()) print("  P ${pctx.}\n")
//        }
//        ctx.list_of_port_declarations()?.also {
//            print("List of Ports decl\n")
////            for (pctx in it.port_declaration()) print("  P ${pctx.toString()}")
//        }
    }

}