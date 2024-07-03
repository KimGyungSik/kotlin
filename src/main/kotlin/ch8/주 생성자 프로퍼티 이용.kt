package ch8

class User3(name: String) {
    val name: String = name
        get() = field.toUpperCase()
//        set(value) {
//            field = "Hello"+value
//        }
}

fun main(args: Array<String>) {
    val user3 = User3("kkang")
//    user3.name = "kim"
    println(user3.name)
}