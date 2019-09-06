package vn.ductt.verk.helper

import java.util.logging.Logger
import kotlin.reflect.KClass

interface Loggable {
    val LOG: Logger // abstract, need to be override

    fun logger(): Logger {
        return Logger.getLogger(unwrapCompanionClass(this.javaClass).name)
    }

    fun verbose(msg: String) = LOG.finest(msg)
    fun debug(msg: String) = LOG.fine(msg)
    fun info(msg: String) = LOG.info(msg)
    fun warn(msg: String) = LOG.warning(msg)
}

// unwrap companion class to enclosing class given a Java Class
fun <T : Any> unwrapCompanionClass(ofClass: Class<T>): Class<*> {
    return if (ofClass.enclosingClass != null &&
        ofClass.enclosingClass.kotlin.objectInstance?.javaClass == ofClass) {
        ofClass.enclosingClass
    } else {
        ofClass
    }
}

// unwrap companion class to enclosing class given a Kotlin Class
fun <T : Any> unwrapCompanionClass(ofClass: KClass<T>): KClass<*> {
    return unwrapCompanionClass(ofClass.java).kotlin
}
