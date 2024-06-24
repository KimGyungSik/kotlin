package ch3.two

import ch3.two.sub.T2_Three
import ch3.two.sub.threeFun
import ch3.two.sub.threeVal

fun main(args:Array<String>) {
    val one = T2_One() // 같은 패키지 import 없이 사용
    val three = T2_Three() // 다른 패키지 import 후 사용

    println(threeVal)
    threeFun()
}