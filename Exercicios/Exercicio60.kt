fun main() {
    data class Pessoa(val nome: String, val idade: Int, val sexo: String)
    val listaPessoas = mutableListOf<Pessoa>()
    var somaIdades = 0
    var homemMais30 = 0
    var mulherMenos18 = 0
    var nomeMaisVelho = ""
    var idadeMaisVelho = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem = Int.MAX_VALUE
    while (true) {
        print("Nome: ")
        val nome = readLine()!!.trim()
        print("Idade: ")
        val idade = readLine()!!.toInt()
        print("Sexo (M/F): ")
        val sexo = readLine()!!.trim().lowercase()
        val pessoa = Pessoa(nome, idade, sexo)
        listaPessoas.add(pessoa)
        somaIdades += idade
        if (idade > idadeMaisVelho) {
            idadeMaisVelho = idade
            nomeMaisVelho = nome
        }
        if (sexo == "f" && idade < idadeMulherMaisJovem) {
            idadeMulherMaisJovem = idade
            nomeMulherMaisJovem = nome
        }
        if (sexo == "m" && idade > 30) {
            homemMais30++
        }
        if (sexo == "f" && idade < 18) {
            mulherMenos18++
        }
        print("Deseja continuar? (S/N): ")
        val continuar = readLine()!!.trim().lowercase()
        if (continuar == "n") break
    }
    val mediaIdade = somaIdades.toDouble() / listaPessoas.size
    println("Pessoa mais velha: $nomeMaisVelho ($idadeMaisVelho anos)")
    println("Mulher mais jovem: ${if (nomeMulherMaisJovem.isNotEmpty()) "$nomeMulherMaisJovem ($idadeMulherMaisJovem anos)" else "Nenhuma mulher cadastrada"}")
    println("Média de idade do grupo: $mediaIdade")
    println("Homens com mais de 30 anos: $homemMais30")
    println("Mulheres com menos de 18 anos: $mulherMenos18")
}