package vn.ductt.verk.verilog.raw

import vn.ductt.verk.verilog.elabed.VerilogElabed

class Net(name: String, val type: NetType, dir: NetDirection): VerilogRaw(name) {
    val descBus = mutableListOf<Array>()    // it could be declared multiple times
    val refBus = mutableListOf<Refer>()



    override fun elaborate(): VerilogElabed {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    enum class NetType {
        WIRE,
        REG,
        LOGIC,
        BIT,
        UNKN
    }

    enum class NetDirection {
        INPUT,
        OUTPUT,
        INOUT,
        INTERNAL    // for internal net
    }

    class Range(val msb: String, val lsb: String)
    class Array {
        private val bus = mutableListOf<Range>()
        fun addRange(range: Range) = bus.add(range)
        fun addRange(msb: String, lsb: String) = bus.add(Range(msb, lsb))
        fun addRange(size: String) = bus.add(Range(size, "0"))
        val size: Int get() = bus.size
    }
    class Refer {
        private val refs = mutableListOf<Range>()
        fun addRef(msb: String, lsb: String = "") = refs.add(Range(msb, lsb))
        val size: Int get() = refs.size
    }
}