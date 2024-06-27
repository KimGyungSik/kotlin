package ch9

open class Super {
    open val name: String = "kkang"
}

open class Sub:Super() {
    final override var name: String = "kim"
}