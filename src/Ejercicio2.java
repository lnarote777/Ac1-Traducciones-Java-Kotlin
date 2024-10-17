
/**
 * En Kotlin el operador ternario como tal no existe pero a la variable se le puede asignar la sentencia if dandole a
 * la variable el resultado segun la sentencia.
 *
 * Kotlin:
 *   fun main() {
 *      val energia = 80
 *      val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
 *      println(estado)
 *}
 */


public class Ejercicio2 {
    public static void main(String[] args) {
        int energia = 80;
        String estado = (energia > 50 )? "Personaje fuerte" : "Personaje débil";

        System.out.println(estado);
    }
}
