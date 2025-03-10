fun main() {
    val nomes = Array(9) { "" }
    val idades = IntArray(9)

    for (i in 0 until 9) {
        print("Digite o nome da ${i + 1}ª pessoa: ")
        nomes[i] = readLine()!!
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
    }

    println("\nPessoas menores de idade:")
    for (i in 0 until 9) {
        if (idades[i] < 18) {
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }
}
