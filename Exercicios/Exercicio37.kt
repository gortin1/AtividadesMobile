fun main(){
    println("Olá qual seu nome? ")
    var nome = readLine()!!
    println("Qual seu genero? (digite F para feminino e M para masculino)")
    var genero = readLine()!!.lowercase()
    println("A quantos anos trabalha na empresa? ")
    var anos = readLine()!!.toInt()
    println("Digite o quanto recebe: ")
    var salario = readLine()!!.toInt()
    if (genero == "f" || genero == "feminino" || genero == "mulher") {
        var salarioNovo: Double = when {
            anos < 15 -> (salario + (salario * 0.05))
            anos >= 15 && anos < 20 -> (salario + (salario * 0.12))
            else -> (salario + (salario * 0.23))
        }
        var salarioNovoFormat = String.format("%.2f", salarioNovo.toDouble())
        var salarioFormat = String.format("%.2f", salario.toDouble())
        println("Olá senhora $nome apos voce trabalhar por $anos voce ira receber um aumento\nSalario antigo: R$$salarioFormat\nSalario Novo: R$$salarioNovoFormat ")

    }
    else if(genero == "m" || genero == "masculino" || genero == "homem"){
        var salarioNovo : Double = when{
            anos < 20 -> (salario + (salario * 0.03))
            anos >= 20 && anos < 30 -> (salario + (salario * 0.13))
            else -> (salario + (salario * 0.25))
        }
        var salarioNovoFormat = String.format("%.2f", salarioNovo.toDouble())
        var salarioFormat = String.format("%.2f", salario.toDouble())
        println("Olá senhor $nome apos voce trabalhar por $anos voce ira receber um aumento\nSalario antigo: R$$salarioFormat\nSalario Novo: R$$salarioNovoFormat ")
    }
    else{
        println("Digite um genero valido")
        return
    }
}