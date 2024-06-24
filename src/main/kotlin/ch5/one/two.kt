package ch5.one

fun sum(no:Int): Int {
    var sum = 0;
    for(i in 1..no) {
        sum+=i;
    }
    return sum
}

fun main(args: Array<String>) {
    val name:String = "kkang"
    println("result: $name .. ${sum(10)}")
}