package vn.ductt.verk.verilog.raw

import vn.ductt.verk.verilog.VerilogObject

class Module(name: String, val kw: String) : VerilogObject(name) {
    override val elabed: Boolean = false

}