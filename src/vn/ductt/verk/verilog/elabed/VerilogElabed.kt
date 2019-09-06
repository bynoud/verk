package vn.ductt.verk.verilog.elabed

import vn.ductt.verk.verilog.VerilogObject

abstract class VerilogElabed(name: String): VerilogObject(name) {
    override val elabed: Boolean = true
}