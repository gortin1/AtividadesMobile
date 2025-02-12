fun main() {
    println("Digite a quantidade de cigarros que você fuma por dia ")
    val cigarros = readln()
    println("Digite a quantos anos você fuma ")
    var tempoFumado = readln()
    var diasFumado: Int = 365 * tempoFumado.toInt()
    var tempoPerdido = ((10*(cigarros.toInt() * diasFumado))/60)/24

    println("Voce perdeu num total de $tempoPerdido dias de vida")
}
