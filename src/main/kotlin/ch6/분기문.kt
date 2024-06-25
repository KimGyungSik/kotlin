package ch6

val a =5

val result = if( a> 10) "hello" else "world"




fun main(args: Array<String>) {
    println(result)

    fun some() : Int{
        return 50
    }

    val data2 = 10
    // 여러 조건을 한꺼번에 명시
    when(data2) {
        10,20 -> println("data2 is 10 or 20")
        30,40 -> println("data2 is 30 or 40")
        some() -> println("data2 is 50") // some()의 반환값이 50일때 실행
        30+30 -> println("data2 is 60") //data2의 값이 60일떄 실행
    }

    //범위 값으로 분기
    val data3 = 15
    when(data3) {
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1<=data3<=10")
        in 11..20 -> println("11<=data3<=20")
        else -> println("invalid data")
    }

    // 집합 데이터로 조건
    val list = listOf<String>("hello","world","kkang")
    val array = arrayOf<String>("one","two","three")
    val data4 = "kkang"
    when(data4) {
        in list -> println("data4 in list")
        in array -> println("data4 in array")
    }

    // Any에 의한 조건
    fun testWhen(data:Any) {
        when(data) {
            1 -> println("data value is 1")
            String -> println("data value is hello")
            is Boolean -> println("data value is Boolean")
        }
    }

    testWhen(true)

    // if-else 대체용으로 사용
    val data5 = 15
    when {
        data5 <=10 -> println(true)
        data5 >10 -> println(false)
        else -> println("selse")
    }

    // 표현식 사용
    val data6 = 3
    val result2 = when(data6) {
        1 -> "1.."
        2 -> "2.."
        else ->  {
            println("else../")
            "hello"
        }
    }
    println(result2)

}