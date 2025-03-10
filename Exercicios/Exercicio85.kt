fun main() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = DoubleArray(5)

    for (i in 0 until 5) {
        print("Digite o nome do ${i + 1}º funcionário: ")
        nomes[i] = readLine()!!
        print("Digite o sexo do ${i + 1}º funcionário (M/F): ")
        sexos[i] = readLine()!!
        print("Digite o salário do ${i + 1}º funcionário: R$")
        salarios[i] = readLine()!!.toDouble()
    }

    println("Funcionárias mulheres que ganham mais de R$ 5.000:")
    for (i in 0 until 5) {
        if ((sexos[i] == "F" || sexos[i] == "f") && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Sexo: ${sexos[i]}, Salário: R$${salarios[i]}")
        }

    }
}
