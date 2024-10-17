
/**
*Para la creacion de la clase Personaje en Kotlin, se crea en una clase a parte (fuera del main) la cual he declarado
* como data class ya que solo contiene y muestra datos. en kotlin el constructor primario se pone directamente entre
* parentesis al lado del nombre de la clase, a diferencia de Java que hay que crear el constructor.
*
* Java:
    public class Personaje {
        String nombre;
        int vida;
        int ataque;

        public Personaje(String nombre, int vida, int ataque) {
            this.nombre = nombre;
            this.vida = vida;
            this.ataque = ataque;
        }

        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Ataque: " + ataque);
        }

        public static void main(String[] args) {
            Personaje goku = new Personaje("Goku", 100, 50);
            goku.mostrarInfo();
        }
    }

 */

fun main() {
    val goku = Personaje("Goku", 100, 50)
    goku.mostrarInfo()
}
