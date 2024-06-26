package ch8

val someData: String by lazy {
    println("lazy...")
    "hello"
}

class User22 {
    val name: String by lazy {
        println("lazt22")
        "kkang"
    }
    val age:Int by lazy {
        println("3333")
        10
    }
    init {
        println("intit...")
    }
    constructor() {
        println("constructor...")
    }
}

fun main(args: Array<String>) {
    val user1 = User22()
    println(user1.name)
    println(user1.age)
    println(someData)
}