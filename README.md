# kotlin


## Chapter 3 코틀린 기본 작성법

* ### 3.1.1 일반 파일과 클래스 파일
  * 일반 파일(File)과 클래스 파일(Class) 구분 X
  * 두 파일에 대한 차이는 없음
  * 굳이 둘을 구분하는 이유는 단순히 코드를 읽기 쉽게 하려는 의도

* ### 3.1.2 파일의 구성요소
  * 대부분 프로그래밍 언어와 비슷
  * 코틀린 파일에도 패키지를 선언할 수 있는데, 반드시 파일의 첫 줄에 선언해야함
  * 코틀린 파일은 클래스를 사용하지 않고 변수와 함수로만 구성가능
  * 모든 구성요소를 클래스로 묶지 않아도 되며, 변수나 함수를 클래스 외부에 선언가능

* ### 3.2 패키지
* ### 3.2.1 패키지 기본 개념
    * 패키지란 관련된 클래스들을 묶기 위한 물리적인 개념
    * 물리적인 개념 : 실제 클래스가 위치하는 폴더
    * 같은 패키지에 있으면 import문 생략
    * 이용하려는 클래스가 다른 패키지에 있다면 import문 명시적 선언해야함
  
* ### 3.2.2 가상 패키지
  * 코틀린에서는 패키지가 꼭 실제 물리적인 폴더와 같을 필요 X
  * 즉, 코틀린 파일이 있는 폴더와 다른 패키지명을 사용가능
  * 파일의 위치와 다른 패키지명을 사용하면, 컴파일 떄 클래스 파일의 위치는 코드에 선언한 패지키명의 폴더가 됨

* ### 3.2.3 변수/함수 임포트
  * 클래스로 선언하지 않은 변수나 함수는 외부에서 어떻게 이용?
    *  변수나 함수도 클래스처럼 그대로 임포트
  * 변수나 함수를 직접 임포트하여 이용할 수 있는 것은 클래스로 묶지 않은 변수와 함수를 최상위 레벨로 관리하기 때문
  * 즉, 패키지 내에 선언된 전역변수나 전역함수처럼 취급

* ### 3.2.4 기본 패키지
  * 별도의 import 구문 없이 사용가능(kotiln.* , kotlin.annotaion.*....)

* ### 3.2.5 이름 변경해서 임포트하기
  * 클래스를 임포트할 떄 이름을 바꾸어 다른 이름 사용가능
    * ```kotlin
      import java.text.SimpleDateFormat as MySimpleDateFormat
  

* ### 자바 vs 코틀린
  * 코틀린에서는 모든 구성요소가 클래스로 묶일 필요는 없다
  * 코틀린에서는 파일명으로 된 클래스를 선언하지 않아도 된다
  * 코틀린에서는 프로그램 코드에서 파일의 위치와 다른 패키지명을 사용가능
  * 자바에서 함수나 변수를 직접 임포트할 수 있는 기능이 있지만 코틀린과는 다름
    * 자바에서는 static으로 선언한 변수나 함수만 직접 임포트해서 사용가능
    * 코틀린에서는 static 예약어 자체가 없음


## Chapter 4 변수와 함수

* ### 4.1 변수 선언 및 초기화

* ### 4.1.1 변수 선언법 (val,var)
  * 변수는 val이나 var 키워드를 이용해 명시적 선언
  * Assign-once(Read-only)와 Mutable로 구분
  * Assign-once는 한번 초기화하면 더는 변경 X
  * Mutable은 언제든지 변경가능
  * 변수 선언시 변수명을 먼저 입력 후 콜론(:) 뒤에 타입 명시
  * 데이터 타입을 명시하지 않으면 `타입 추론`을 이용해 자동으로 타입 적용
  * val은 이후 값변경 X -> 읽기전용변수
  * var은 이후 값변경 O
  * 코틀린에서 변수는 프로퍼티(property)

* ### 4.1.2 변수 초기화
  * 변수 선언은 최상위(클래스 외부),클래스 내부, 함수 내부에서 가능
  * 자동 초기화 X, 코드에서 직접 초기화 
  * 함수 내부에서 변수 선언과 동시에 값을 초기화하지 않아도 에러발생 X
  * 하지만 변수를 이용하려면 반드시 초기화해야함
  * 최상위 레벨과 클래스 멤버변수들은 변수의 선언과 초기화를 동시에 해줘야함

* ### 4.1.3 null이 될 수 있는 변수와 null
  * 변수에 null 값을 대입할 떄 주의할 점
    * 명시적으로 null이 될 수 있는 (nullable)변수로 선언해야함
    * null을 대입할 수 있는 변수와 없는 변수로 구분됨
  * 변수를 선언할떄 초기에 null을 대입하고 이후 적절한 곳에서 값을 대입하고자 한다면
    * ```kotlin
      var nullableData2: String? = null
      
      nullableData2 = "hello"
    ? 기호로 null이 될 수 있음을 명시, 변수값을 변경해야 하므로 var로 선언
  
* ### 4.1.4 상수변수 선언 (const)
  * val로 선언한 변수의 초깃값을 직접 변경 X
  * val은 프로퍼티이기 때문에 해당 변수의 get() 함수를 통해 변경가능
  * 처음에 대입한 값을 변경할 수 없고 항상 초깃값만 반환하도록 보장하는 변수 (const를 사용해 변수를 선언)
    * const 제약사항
      * var 변수에는 사용 X
      * 클래스, 함수 내부에서는 사용X
      * 변수를 최상위 레벨로 선언하거나 object로 선언한 클래스에서만 사용가능
  

* ### 4.2 함수 사용법
* ### 4.2.1 함수 선언 (fun)
  * 형식
    * ```kotlin
      fun 함수명(매개변수명 : 타입) : 반환타입 {}
      ex) fun sum(a: Int, b:Int): Int {
            return a+b
        }
  * 함수를 선언할 때 매개변수 부분에는 var,val을 선언못함
  * 매개변수는 무조건 val로 적용됨
  * 의미없는 반환값이 없을 때는 Unit으로 명시 (생략가능)
  * 특정 함수 내에 선언된 함수는 지역변수와 비슷한 개념 -> 외부에서 호출 X
  * 함수 선언 시 단일 구문으로 값을 반환하는 함수라면 중괄호 생략가능 반환값도 생략가능

* ### 4.2.2 함수 오버로딩
  * 자바와 똑같음

* ### 기본 인수와 명명된 인수
  * 함수를 호출하면서 전달하는 값을 인수
  * 인수 값을 전달받는 함수의 변수를 매개변수
  * 기본인수 = 호출자가 인수를 명시하지 않아도 피호출자가 알아서 기본값을 적용하게함
    * ```kotlin
      fun sayHello(name: String?) {
        if(name == null){
            println("Hello!! kkang")
        }else {
            println("Heelo!!"+name)
        }
      
      해당 코드를
      
      fun sayHello(name: String = "kkang") {
        println("Heelo!!"+name)
      }

  * 매개변수가 여러개일땐 명명된 인수를 사용해야함
    * ```kotlin
      fun sayHello(name: String = "kkang",no:Int) {
        println("Heelo!!"+name)
      }
      
      sayHello(10) -> 에러
      sayHello("lee",20)
      sayHello(no=20)
      
  * 명명된 인수 = 인수를 대입할 매개변수의 이름을 지정하는 기법


* ### 4.2.4 중위 표현식 (infix)
  * A+B 구문에서 A와 B라는 피연산자 사이에 +라는 연산자를 놓을 떄 `중위 포현식을 사용했다`라고 표현
  * 중위 표현식은 fun 앞에 infix라는 예약어를 추가하면 됨
    * ```kotlin
      obj.infixFun(10)
      을 중위표현식으로 표현하면
      obj infixFun 10
      객체명 함수명 매개변수
      
      infix fun infixFun(a: Int) {
          println("infixFun call...")
      }

  * infix 제약사항
    * 클래스의 멤버 함수로 선언하거나 클래스의 확장함수일 때
    * 매개변수가 하나인 함수일 때
    

* ### 4.2.5 가변 인수 (vararg)
  * 매개변수가 많을때 작성하면 편함
  * 가변 인수를 포함하는 함수는 vararg라는 예약어를 이용하여 선언
  * ```kotlin
    fun <T> varargsFun(a1:Int,vararg array: T) {
    for(a in array) {
        println(a)
      }
    }
      
    fun main(args : Array<String>) {
     varargsFun(10,"hello","world") // 반드시 첫번째 인수로 Int타입의 데이터를 지정해야함
     varargsFun(10,20,false)
    }

* ### 4.2.6 재귀함수 (tailrec)
  * tailrec을 이용하면 소스코드가 자바로 변경될 때 재귀함수가 아닌 일반적인 반복문으로 변형
  * 즉, StackOverflowError의 부담감에서 벗어날 수 있음
  * tailrec 예약어 주의사항
    * tailrec 재귀함수에서 자신을 다시 호출하는 구문은 함수의 맨 마지막 작업으로 작성해야함
    * 즉, 함수의 맨 마지막 작업이 재귀호출 구문이여야함
    

* ### 자바 vs 코틀린
  * 코틀린에서는 const로 최상위 레벨에 상수변수를 선언한다
    * public static final int CONST_VAL = 10;
    * const val CONST_VAL = 10
  * 최상위 레벨로 선언되어 객체 멤버에 포함되지 않으며 const로 선언되어 상수변수가 됨

  * 코틀린의 final은 자바의 final과 다르다
    * 자바에서 상수변수를 정의할때 final을 쓰지만 코틀린에서는 아님
    * 코틀린에서는 val로 선언함

  * 코틀린은 변수값이 자동으로 초기화되지 않는다
  * 코틀린에서는 자바에서 제공하지 않는 함수의 다양한 이용 방법을 제공한다

## Chapter 5 데이터 타입

* ### 5.1 기초 데이터 타입

* ### 5.1.1 숫자 타입 (Int,Long,Short,Double,Float)
  * 코틀린에서 모든 것은 객체
  * 클래스로 타입을 명시하여 선언한 변수는 그 자체로 객체
  * ```kotlin
    val intData : Int = 10
    val result = intData.minus(5)

    fun main(args: Array<String>) {
      println(result)
    }

  * 문자는 숫자 타입이 아니며, 숫자 타입에 대한 자동 형변환을 제공 X
  * 숫자 타입에 값을 대입할 때 규칙
    * Decimals,Haxadecimals,Binaries 값 대입 가능
    * Long형은 값 뒤에 'L' 사용
    * 실수 기본형은 Double
    * 실수형은 10.0e2로도 표현 가능
    * Float 형은 값 뒤에 'f', 'F' 사용
  

* ### 5.1.2 논리,문자와 문자열 타입 (Boolean,char,String)
  * Boolean 타입은 true,false값을 표현
    * || -> 논리합
    * && -> 논리곱
    * ! -> 부정
  
  * Char은 문자를 표현하는 타입
    * Char타입은 Number타입으로 표현 X
    
  * String은 문자열을 표현하는 타입
    * 문자열은 str[i]로 접근할 수 있는 Char의 집합
    * "" -> escaped string
    * """ -> raw string
    * 전자는 \n으로 개행되지만, 후자는 키보드에서 입력한 엔터 등의 값이 문자열에 그대로 적용
    * 문자열 내에 데이터를 쉽게 포함하기 위한 포현식 
      * 변수는 $변수명
      * 표현식은 ${표현식}
      * ```kotlin
            fun sum(no:Int): Int {
              var sum = 0;
                for(i in 1..no) {
                    sum+=i;
                }
              return sum
            }

          fun main(args: Array<String>) {
              val name:String = "kkang"
             println("result: $name .. ${sum(10)}")
          }

* ### 5.1.3 Any 타입
  * 코틀린 클래스의 최상위 클래스
  * 특정 변수에 대입되는 타입을 예측할 수 없을 떄 유용하게 사용
  * 자바의 Object타입과 유사

* ### 5.1.4 null 허용 타입
  * ```kotlin
    fun parseInt(str: String): Int? {
      return str.toIntOrNull()
    }
  * toIntOrNull함수는 문자열을 Int타입으로 변형하여 반환하고 변형할 수 없다면 null을 반환하는 함수
  * null을 반환할 수 있으므로 Int?로 선언
  * Any타입도 예외없음 ex) val data: Any? = null 이라고 명시해야함

* ### 5.1.5 Any, Any? 타입
  * Any 타입은 Any? 타입에 대입 O
  * Any? 타입은 Any타입에 대입 X
  * Any?타입이 코틀린 최상위 타입 Any?(조상) Any(자손)
    * ```kotlin
      val myVal1:Any = 10
      val myVal2:Any? = myVal1
  
      val myVal3:Any? = 10
      //val myVal4:Any = myVal3
      val myVal5: Any = myVal3 as Any
  
      val myInt1:Int = 10
      val myInt2:Int? = myInt1
  
      val myInt3:Int? = 10
      //val myInt4:Int = myInt3
      val myInt5: Int = myInt3 as Int

* ### 5.1.6 Unit과 Nothing
  * Unit은 흔히 함수의 반환 구문이 없다는 것을 표현 (자바의 void)
  * Nothing은 의미 있는 데이터가 없다는 것을 명시적으로 선언하기 위해 사용하는 타입

* ### 5.1.7 타입 확인과 캐스팅 (is, !is)
  * 데이터 타입을 확인해야 할때 사용
  * is 연산자로 타입을 확인해서 타입이 맞으면 자동으로 캐스팅됨
  * 코틀린에서는 데이터 타입의 변환이 자동으로 이루어지지 않음
  * 기초 데이터 타입에 대한 자동 형변환을 제공 X
  * Int타입에 변수를 Double타입의 변수에 대입하려면 변수.toDouble()함수를 이용해야함
  * 코틀린에서 형 변환이 자동으로 이뤄지는 떄는 값의 형 변환임
  * val l = 1L + 3 // Long + Int -> Long
  * as 연산자는 클래스의 상하위 관계에서만 가능

* ### 5.2. 컬렉션 타입

* ### 5.2.1 배열
  * 배열을 만드는 가장 쉬운 방법 `arrayOf()`
  * 제네릭스를 이용한 배열의 타입제한 또는 `intArrayof()`이용
  * 또는 Array클래스를 직접 이용도 가능
  * Array클래스의 생성자
    * Array(size: Int, init: (Int)-> T)
    * ex) var array3 = Array(3,{i -> i*10})
    * 첫번쨰 매개변수는 배열의 크기
    * 두번째 매개변수는 배열 index값에 10을 곱해서 대입
    * ```kotlin
      var array4 = Array<Int>(3,{i->i*10})
      var array5 = IntArray(3,{i->i*10})
  * 배열을 정의할 때 크기만 지정하고 데이터는 대입하지 않는 빈 상태 정의방법
    * arrayOfNulls()
      *  val array2 = arrayOfNulls<Any>(3)
    * 배열 클래스에 초깃값을 빈 상태로 주기
      * val emptyArr = Array<String>(3,{""})

* ### 5.2.2 List,Set,Map
 
  ![KakaoTalk_20240624_213845317](https://github.com/KimGyungSik/kotlin/assets/139200972/00a25427-8ef5-4b3c-a526-fb1eacef4802)
  
![KakaoTalk_20240624_214046016](https://github.com/KimGyungSik/kotlin/assets/139200972/ef1d03fe-1828-4917-963e-560a359a6611)


  * 코틀린에서 컬렉션 타입의 클래스들은 가변클래스와 불변클래스로 구분됨
  * 가변 클래스 : 컬렉션 타입의 객체에 데이터를 변경하거나 추가할 수 있음
  * 불변 클래스 : 한 번 데이터 대입이 끝난 객체를 읽기 전용으로 이용하는 정도
  * List인터페이스로 표현되는 객체는 불변(size(),get()만 제공)
  * MutableList인터페이스로 표현되는 객체는 가변(추가로 add(), set()제공)
  * ArrayList클래스를 직접 이용시 가변 상태 
  * 자바의 List,Set,Map 사용가능

* ### 5.2.3 이터레이터 (Iterator)
  * 컬렉션 타입의 데이터를 순회하기 위한 인터페이스
  * List,Map,Set,Array 타입의 데이터 모두 Iterator타입의 객체로 변형가능
  * iterator() 함수 사용
  * Map객체는 next()함수에 의해 Map.Entry 타입으로 객체를 가져옴 


* ### 자바 vs 코틀린
  * 코틀린에서는 모든 것이 객체이다
    * 자바에서는 래퍼 클래스를 제공
    * ![KakaoTalk_20240624_220012017](https://github.com/KimGyungSik/kotlin/assets/139200972/0de81353-86fb-4639-af55-ee974608f93f)
  * 코틀린에서는 기초 데이터 타입에 대한 자동 캐스팅을 제공하지 않는다
  * 코틀린에는 switch-case 구문이 없다
  * 코틀린은 배열을 []로 선언하지 않으며 {}을 이용하여 초기화하지도 않는다
    * 모든 것이 객체이므로 val array:Array로 표현되며 초깃값을 대입할 떄도 arrayOf()등의 함수를 이용해야함


