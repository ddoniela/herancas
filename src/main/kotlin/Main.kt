fun main(){

val cachorro = Cachorro(
    "Rex",
    5

)

val cavalo = Cavalo(
    "Bento",
    5
)

val preguica = Preguica(
    "Ana",
    2
)

    preguica.deslocamento()
    cachorro.deslocamento()
    cavalo.deslocamento()
    cachorro.emitirSom()
    cavalo.emitirSom()
    preguica.emitirSom()

}