package ch9

class PropertyVisibilityTest2 {
    protected val data: Int = 10
       get() = field
//        private set(value) {field=value}
}

class ConstructorVisbiclity private constructor(name:String) {
//    val obj = ConstructorVisbiclity("kim")
    val name = name
    public constructor(name:String,no:Int): this(name){}
}



fun main(args:Array<String>) {
    val obj = PropertyVisibilityTest2()
//    println(obj.data)
//    obj.data = 10 에러

    val obj2 = ConstructorVisbiclity("kim",10)
    println(obj2.name)

}