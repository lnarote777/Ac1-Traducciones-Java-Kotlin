data class Personaje (val nombre: String, var vida: Int, val ataque: Int){

    fun mostrarInfo(){
        println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
    }
}