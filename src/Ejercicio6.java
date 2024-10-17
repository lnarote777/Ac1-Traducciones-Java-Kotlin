
/**
 * En Kotlin para que una variable pueda ser nula debe indicarese en el tipo junto con una interrogación '?', si no
 * dara un error.
 * En Java no existe este control de nulos. Una variable puede ser nulla en cualquier momento sin decir explicitamente
 * que lo pueda ser o no.
 *
 * Kotlin:
 *  fun main() {
 *      var personaje: String? = null
 *      if (personaje != null) {
 *          println("El personaje es $personaje")
 *      } else {
 *          println("No hay personaje.")
 *      }
 *  }
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        String personaje = null;

        if (personaje != null) {
            System.out.println("El personaje es:" + personaje);
        }else {
            System.out.println("No hay personaje.");
        }
    }
}
