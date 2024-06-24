package ch5.two

fun main(args: Array<String>) {
    var array = arrayOf(1,"kkang",true)

    array[0] = "1111"
    array[2] = 10

    for(i in array) {
        println(i)
    }

    var arrayInt = arrayOf<Int>(10,11,12)

    println("${arrayInt.get(0)},${arrayInt.get(1)},${arrayInt.get(2)}")

    var arrayInt2 = intArrayOf(10,20,30)

    var array3 = Array(3,{i -> i*10})
    println("${array3.get(0)},${array3.get(1)},${array3.get(2)}")


    val array2 = arrayOfNulls<Any>(3)
    array2[0] = 10
    array2[1] = "String"
    array2[2] = true
    println("${array2.get(0)},${array2.get(1)},${array2.get(2)}")

    val emptyArr = Array<String>(3,{""})
    emptyArr[0] = "10"
    emptyArr[1] = "String"
    emptyArr[2] = "true"
    println("${emptyArr.get(0)},${emptyArr.get(1)},${emptyArr.get(2)}")
}

