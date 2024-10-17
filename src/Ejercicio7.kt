fun main (args : Array<String>){
    println(multiplicar(5))

    val sumar = {num1: Int, num2: Int -> num1 + num2}
    println(sumar(3,4))
}

fun multiplicar(num : Int) : Int{
    return num*2
}


