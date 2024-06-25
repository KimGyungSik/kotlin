package ch6

fun main(args: Array<String>) {

    val list = listOf("hello","world","!")
    for((index,value) in list.withIndex()) {
        println("$index, $value")
    }
}