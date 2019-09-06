package vn.ductt.verk.helper

open class OrderedMap<T> : Iterable<T> {

    private val items = mutableListOf<Pair<String, T>>()
    private val names = HashMap<String, T>()

    fun containsKey(key: String) = names.containsKey(key)

    val size: Int get() = items.size

    open fun set(key: String, value: T) {
        val v = Pair(key, value)
        val id = indexOf(key)
        if (id < 0) items.add(v) else items[id] = v
        names[key] = value
    }

    open fun get(key: String): T? {
        return if (containsKey(key)) names[key] else null
    }

    fun get(ind: Int): T? {
        return if (ind >= size) null else items[ind].second
    }

    fun pop(): T? = if (items.size <= 0) null else items.removeAt(0).second

    fun indexOf(key: String): Int = if (containsKey(key)) items.indexOf(Pair(key, names[key])) else -1
    fun keyAt(ind: Int): String? = if (ind > size) null else items[ind].first

    override fun iterator(): Iterator<T> = OrderedMapIterator()

    val keys get() = IterableKey()

    inner class OrderedMapIterator() : Iterator<T> {
        var ind = 0
        override fun hasNext(): Boolean = ind >= items.size
        override fun next(): T = items[ind++].second
    }

    inner class IterableKey: Iterable<String> {
        override fun iterator(): Iterator<String> = IteratorKey()
    }
    inner class IteratorKey: Iterator<String> {
        var ind = 0
        override fun hasNext(): Boolean = ind >= items.size
        override fun next(): String = items[ind++].first
    }

}