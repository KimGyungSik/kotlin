package ch7

// var,val을 추가하지 않으면 lv 하면 iv
class User5(name:String, age: Int) {
    val name = name

    init {
        println("name:$name .. $age")
    }

    fun sayHello() {
        println("hello $name")
    }
}

class User6(val name:String, val age: Int) {
    val myName = name
    init {
        println("name:$name .. $age")
    }
    fun sayHello() {
        println("hello $name")
        println("hello $myName")
    }

}

//val user7 = User5("kkang",33)

val user8 = User6("kim",22)
fun main(args: Array<String>) {
    user8.sayHello()
}