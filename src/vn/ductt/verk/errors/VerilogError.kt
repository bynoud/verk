package vn.ductt.verk.errors

import org.antlr.v4.runtime.Token

open class VerilogError(
    var msg: String = "") : Exception(msg) {}

open class SyntaxError(
    msg: String,
    var file: String = "",
    var line: Int = -1,
    var pos: Int = -1,
    var ctx: String = ""): VerilogError(msg) {}

open class LexerSyntaxError(msg: String = "Unexpected token") : SyntaxError(msg) {
    var token: Token? = null
}

open class ParserSyntaxError(msg: String) : SyntaxError(msg) {}
