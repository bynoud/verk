package vn.ductt.verk.verilog.raw

import vn.ductt.verk.helper.Loggable
import vn.ductt.verk.prepr.Option
import vn.ductt.verk.verilog.VerilogList
import vn.ductt.verk.verilog.VerilogObject
import vn.ductt.verk.verilog.elabed.VerilogElabed
import java.util.logging.Logger

class Unit(val option: Option) : VerilogRaw("\$unit"), Loggable {
    override val LOG: Logger = logger()

    val mods = VerilogList<Module>()
    val tops = VerilogList<Module>()

    fun newModule(name: String, kw: String = "module"): Module {
        debug("NewModule '$name'\n")
        val m = Module(name, kw)
        mods.set(m)
        return m
    }

    fun findModule(name: String): Module? = mods.get(name)

//    fun removeModule(name: String)

    override fun elaborate(): vn.ductt.verk.verilog.elabed.Unit {
        // FIXME
    }
}