open class Animal (
    var nome: String, var idade: Int
    ){

    open fun emitirSom(){
        println("Emitindo som")
    }
    open fun deslocamento(){
        println("Correndo")
    }
}