package ch4.one

fun <T> varargsFun(a1:Int,vararg array: T) {
    for(a in array) {
        println(a)
    }
}

fun main(args : Array<String>) {
    varargsFun(10,"hello","world") // 반드시 첫번째 인수로 Int타입의 데이터를 지정해야함
    varargsFun(10,20,false)
}