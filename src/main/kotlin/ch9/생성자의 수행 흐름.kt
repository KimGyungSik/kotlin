package ch9

open class Super1 {
    constructor(name:String, no:Int) {
        println("Super...constructor($name,$no)")
    }
    init {
        println("Super ..init call...")
    }
}

class Sub1(name:String): Super1(name,10) {
    constructor(name:String,no:Int): this(name) {
        println("Sub...contructor($name,$no)")
    }
    init {
        println("Sub ...init call...")
    }
}

fun main(args:Array<String>) {
    Sub1("kkang")
    println("..............................")
    Sub1("kim",10)
}