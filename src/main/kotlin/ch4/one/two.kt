package ch4.one

val topData1: Int = 10
val topData2: Int = 20


class User {
    val objData: String = "hello"
    val objData2: String = "world"

    fun some() {
        val localData1:Int
        val localData2:String

        localData1 = 40
        println(localData1)

        localData2 = "hello"
        println(localData2)
    }
}