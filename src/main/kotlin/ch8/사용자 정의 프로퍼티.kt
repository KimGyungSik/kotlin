package ch8

import ch7.user8

class User1 {
    // 사용자 정의 프로퍼티
    val age2: Int
        get() = 10

    var greeting: String = ""
        set(value) {
            field = "hello"+ value
        }
        get() = field.toUpperCase()
    var age: Int = 0
        set(value) {
            if(value > 0)
                field = value
            else
                field = 0
        }
}
fun main(args: Array<String>) {
    val user1 = User1()
    user1.greeting = "kkang"
    println(user1.greeting)
    user1.age = -1
    println(user1.age)
}