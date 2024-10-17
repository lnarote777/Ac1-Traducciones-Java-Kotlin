
/**
*En Java para crear un rango y recorrerlo primero se declara la variable que se usará para contar en el rango,
* luego usando esa variable se pondra hasta donde llegar y luego la accion que hará que siga avanzando (i++)
*
* En Kotlin solo habrá que poner la variable in y el rango. Los dos puntos '..' hacen referencia a que el rango
* será de 1 a 5 incluidos sin necesidad de usar '<' y '>'
*
* Kotlin:
    fun main() {
        for (i in 1..5) {
            if (i == 3) {
                continue // Salta la iteración cuando i es 3
            }
            println("Número: $i")
        }
    }
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Numero: " + i);
        }
    }
}
