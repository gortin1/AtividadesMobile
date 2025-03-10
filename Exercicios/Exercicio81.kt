fun main() {
    val idades = IntArray(8)
    var somaIdades = 0
    var maiorIdade = 0
    var posicoesMaiorIdade = ""

    for (i in 0..7) {
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
        somaIdades += idades[i]

        if (idades[i] > maiorIdade) {
            maiorIdade = idades[i]
            posicoesMaiorIdade = (i + 1).toString()
        } else if (idades[i] == maiorIdade) {
            posicoesMaiorIdade += ", ${i + 1}"
        }
    }

    val mediaIdades = somaIdades / idades.size

    println("Média de idades: $mediaIdades")

    println("Posições com pessoas com mais de 25 anos:")
    for (i in 0..7) {
        if (idades[i] > 25) {
            println("Posição ${i + 1}")
        }
    }

    println("A maior idade digitada foi: $maiorIdade")
    println("A maior idade foi digitada na posição: $posicoesMaiorIdade")
}
