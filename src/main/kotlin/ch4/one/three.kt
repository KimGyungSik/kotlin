package ch4.one

fun sum(a:Int,b:Int):Int {
    var sum = 0
    fun calsum() {
        for (i in a..b) {
            sum += i
        }
    }
    calsum()
    return sum
}

fun main(args: Array<String>) {
    var result = sum(1,10)
    println(result)
    result = sum(1,4);
    println(result)

}