fun main() {
    println("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    parOuImpar(numero)
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("O número $numero é PAR.")
    } else {
        println("O número $numero é ÍMPAR.")
    }
}

