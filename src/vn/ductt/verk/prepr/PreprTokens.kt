package vn.ductt.verk.prepr

import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.TokenFactory
import org.antlr.v4.runtime.TokenSource

abstract class PreprTokens(var source: TokenSource): TokenSource {
    private var prevs = mutableListOf<TokenSource>()

    open fun downStream(src: TokenSource) {
        prevs.add(source)
        source = src
    }

    open fun upStream(): Boolean {
        if (prevs.isEmpty()) return false
        source = prevs.removeAt(prevs.size-1)
        return true
    }

    override fun setTokenFactory(factory: TokenFactory<*>) {
        source.tokenFactory = factory
        for (src in prevs) src.tokenFactory = factory
    }

    override fun getCharPositionInLine(): Int = source.charPositionInLine

    override fun getLine(): Int = source.line

    override fun getSourceName(): String = source.sourceName

    override fun getTokenFactory(): TokenFactory<*> = source.tokenFactory

    override fun getInputStream(): CharStream = source.inputStream

}