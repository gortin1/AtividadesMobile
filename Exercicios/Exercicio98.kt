fun main() {
    println("Resultado da soma entre 1 e 6: ${superSomador(1, 6)}")  // Exemplo 1
}

fun superSomador(inicio: Int, fim: Int): Int {
    var soma = 0
    for (i in inicio..fim) {
        soma += i
    }
    return soma
}

