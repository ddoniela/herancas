class Preguica (
    nome: String, idade: Int
) : Animal(nome, idade){

    override fun emitirSom() {
        println("Emitindo som de preguiça: Aaaaaaah")
    }

    override fun deslocamento(){
        println("Subindo em árvores como uma preguiça")
    }
}