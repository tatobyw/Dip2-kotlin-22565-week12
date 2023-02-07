//User-define function
//High order function
fun div(a:Int,b:Int) = a / b
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int):Int{
    return operation(a,b)
}
//Inline Function
inline fun myFunction(function:()->Unit){
    println("I am inline function - A")
    function()
    println("I am inline function - B")
}
//Lambda Function
val sum = {num1:Int,num2:Int->num1 + num2}
fun multiply(a: Int, b: Int, myLambda: (Int)->Unit){
    val add = a + b
    myLambda(add)
}

//fun student(code:Int = 101,name:String = "Mark") = println("ID:$code Name:$name")
fun student(code: Int, name: String = "Mark", age: Int = 40):String ="ID:$code Name:$name Age:$age"
fun getName(firstName: String, lastName: String): String = "$firstName $lastName"

fun addNumber(n1:Double,n2:Double):Double{
    return n1 + n2
}

fun add(a:Int,b:Int):Int{
    //println(a + b)
    return a + b
}
//Built-in function
fun mathRoot(){
    val number = 9.0
    val result = Math.sqrt(number)
    println("The root of $number = $result")
}
fun mathPower(){
    val a = 3.0
    val b = 2.0
    val result = Math.pow(a,b)
    println("The power of $a^$b = $result")
}