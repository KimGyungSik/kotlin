package ch5.two

fun main(args: Array<String>) {
    // List
    val immutableList : List<String> = listOf("heelo","world")
    println("${immutableList.get(0)}..${immutableList.get(1)}")

    val mutableList: MutableList<String> = mutableListOf("hello","world")
    mutableList.add("kkang")
    mutableList.set(1,"korea")
    println("${mutableList.get(0)}..${mutableList.get(1)}")

    val arrayList:ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("world")
    arrayList.set(1,"world")
    println("${arrayList.get(0)}..${arrayList.get(1)}")

    // List - iterator 활용
    val iterator = arrayList.iterator();
    while(iterator.hasNext()) {
        println(iterator.next())
    }

    // Map
    val immutableMap1 = mapOf<String,String>(Pair("one","hello"),Pair("two","world"))
    println("${immutableMap1.get("one")}..${immutableMap1.get("two")}")
    val immutableMap2 = mapOf<String,String>("one" to "hello","two" to "world")
    println("${immutableMap2.get("one")}..${immutableMap1.get("two")}")

    val mutableMap = mutableMapOf<String,String>()
    mutableMap.put("one","hello")
    mutableMap.put("two","world")
    println("${mutableMap.get("one")}..${mutableMap.get("two")}")
    val iterator2: Iterator<Map.Entry<String,String>> = mutableMap.iterator();
    while (iterator2.hasNext()) {
        val entry = iterator2.next()
        println("${entry.key} - ${entry.value}")
    }

    // Set
    val immutableSet:Set<String> = setOf<String>("hello","hello","world")
    println("${immutableSet.elementAt(0)}..${immutableSet.elementAt(1)}")
    val mutableSet = mutableSetOf<String>()
    mutableSet.add("hello")
    mutableSet.add("set")
    println("${mutableSet.elementAt(0)}..${mutableSet.elementAt(1)}")
}