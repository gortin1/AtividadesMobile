import kotlin.random.Random
fun main(){
    val numerosSorteados = mutableListOf<Int>()
    var acimaDeCinco = 0
    var divisiveisPorTres = 0
    for (i in 1..20) {
        val numero = Random.nextInt(0, 11)
        numerosSorteados.add(numero)

        if (numero > 5) {
            acimaDeCinco++
        }
        if (numero % 3 == 0) {
            divisiveisPorTres++
        }
    }
    println("Números sorteados: $numerosSorteados")
    println("Quantidade de números acima de 5: $acimaDeCinco")
    println("Quantidade de números divisíveis por 3: $divisiveisPorTres")
}