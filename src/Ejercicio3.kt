
/**
* En los bucles for se puede ver que hay una diferencia. Para recorrer una lista en Kotlin podemos ponerle un nombre a
* la variable que sera la que recorra la lista cambiandose por cada item además de cambiar y usar in. Así es más
* sencillo saber que se refiere a los items dentro de la lista.
*
* En Java sin embargo se declara la variable ':' y el nombre de la lista a recorrer
*
* Java:
    public class Main {
        public static void main(String[] args) {
            String[] cofres = {"Espada", "Escudo", "Poción"};
            for (String cofre : cofres) {
                System.out.println("Has encontrado: " + cofre);
            }
        }
    }
*/

fun main() {
    val cofres = listOf("Espada", "Escudo", "Poción")

    for (cofre in cofres) {
        println("Has encontrado: $cofre")
    }
}