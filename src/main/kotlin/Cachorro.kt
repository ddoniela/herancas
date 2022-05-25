class Cachorro(
    nome: String, idade: Int
) : Animal(nome, idade){

    override fun emitirSom() {
        println("Emitindo som de cachorro: au au")
    }

    override fun deslocamento() {
        println("Correndo como um cachorro")
    }
}