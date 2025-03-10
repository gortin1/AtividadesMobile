fun main() {
    val notas = DoubleArray(10)
    var somaNotas = 0.0

    for (i in notas.indices) {
        print("Digite a nota do ${i + 1}º aluno: ")
        notas[i] = readLine()!!.toDouble()
        somaNotas += notas[i]
    }

    val media = somaNotas / notas.size
    var alunosAcimaDaMedia = 0
    var maiorNota = 0.0
    val posicoesMaiorNota = mutableListOf<Int>()

    for (nota in notas) {
        if (nota > media) {
            alunosAcimaDaMedia++
        }
        if (nota > maiorNota) {
            maiorNota = nota
        }
    }

    for (i in notas.indices) {
        if (notas[i] == maiorNota) {
            posicoesMaiorNota.add(i + 1)
        }
    }

    println("\nResultados:")
    println("Média da turma: $media")
    println("Quantidade de alunos acima da média: $alunosAcimaDaMedia")
    println("Maior nota: $maiorNota")
    println("Posições onde a maior nota aparece: ${posicoesMaiorNota.joinToString(", ")}")
}
