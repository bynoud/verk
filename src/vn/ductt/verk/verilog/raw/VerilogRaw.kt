package vn.ductt.verk.verilog.raw

import vn.ductt.verk.verilog.VerilogObject
import vn.ductt.verk.verilog.elabed.VerilogElabed

abstract class VerilogRaw(name: String) : VerilogObject(name) {
    override val elabed: Boolean = false

    abstract fun elaborate(): VerilogElabed
}