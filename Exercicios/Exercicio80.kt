fun main() {
    val vetor = IntArray(30)
    var chave: Int
    var contagem = 0

    for (i in vetor.indices) {
        vetor[i] = (1..15).random()
    }

    println("Vetor preenchido com números aleatórios entre 1 e 15")
    for (numero in vetor) {
        println("$numero ")
    }

    print("Digite um número (chave) para verificar: ")
    chave = readLine()!!.toInt()


    println("A chave $chave foi encontrada nas posições:")
    for (i in vetor.indices) {
        if (vetor[i] == chave) {
            println("Posição ${i + 1}")
            contagem++
        }
    }

    println("A chave $chave foi sorteada $contagem vez(es).")
}
