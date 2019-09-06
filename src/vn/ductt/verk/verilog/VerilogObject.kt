package vn.ductt.verk.verilog

import vn.ductt.verk.helper.OrderedMap

abstract class VerilogObject(val name: String) {
    abstract val elabed: Boolean
}

class VerilogList<T: VerilogObject>: OrderedMap<T>() {
    fun set(obj: T) = super.set(obj.name, obj)
    fun indexOf(obj: T) = super.indexOf(obj.name)
}