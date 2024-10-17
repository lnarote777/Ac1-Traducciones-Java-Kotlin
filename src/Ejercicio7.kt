/**
 * A diferencia de Java, en Kotlin las funciones lambdas se escriben entre llaves que es lo que representa el cuerpo
 * de lambda.
 *
 * Java:
 *      public class Main {
 *          public static void main(String[] args) {
 *              System.out.println(multiplicar(5));
 *
 *              // Lambda en Java (requiere interfaz funcional)
 *              Operacion operacion = (a, b) -> a + b;
 *              System.out.println(operacion.sumar(3, 4));
 *          }
 *
 *          public static int multiplicar(int num) {
 *              return num * 2;
 *          }
 *
 *          interface Operacion {
 *              int sumar(int a, int b);
 *          }
 *      }
 */
fun main (){
    println(multiplicar(5))

    val sumar = {num1: Int, num2: Int -> num1 + num2}
    println(sumar(3,4))
}

fun multiplicar(num : Int) : Int{
    return num*2
}


