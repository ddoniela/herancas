class Cavalo (
    nome: String, idade: Int
) : Animal(nome, idade){

    override fun emitirSom() {
        println("Emitindo som de cavalo: pocotó pocotó")
    }

    override fun deslocamento() {
        println("Correndo como um cavalo")
    }
}