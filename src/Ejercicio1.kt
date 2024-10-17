
/**
*Para declarar variable es Kotlin usamos val y var. La diferencia entre esatas dos formas es que:
* cuando una variable no cambia de valor se utiliza val y cuando queremos que su valor vaya cambiando como por ejemplo
* en un contador, pues usaremos var ya que val no nos lo permite.
*
* en java no se utiliza esta forma, sin embargo hay que declarar el tipo de variable que es.
*
* Java:
    public class Main {
        public static void main(String[] args) {
            int vida = 100;
            String personaje = "Naruto";
            System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
        }
    }
*/

fun main() {
    val vida = 100
    val personaje = "Naruto"

    println("El personaje $personaje tiene $vida puntos de vida")
}