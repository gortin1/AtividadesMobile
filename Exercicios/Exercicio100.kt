fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toFloat()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toFloat()

    val resultadoMedia = mediaNew(nota1, nota2)
    val situacaoAluno = situacao(resultadoMedia)

    println("A média do aluno é: $resultadoMedia")
    println("O aluno está: $situacaoAluno")
}

fun mediaNew(nota1: Float, nota2: Float): Float {
    return (nota1 + nota2) / 2
}

fun situacao(media: Float): String {
    return when {
        media >= 7 -> "Aprovado"
        media >= 5 -> "Recuperação"
        else -> "Reprovado"
    }
}


