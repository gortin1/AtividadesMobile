fun main(){
    var funcionariosHomens = mutableListOf<String>()
    var funcionariosMulheres = mutableListOf<String>()
    while(true) {
        println("Digite o sexo do funcionario: (escreva Masculino ou feminino)")
        var sex = readln().toString().lowercase()
        if (sex == "masculino"){
            println("Qual o nome do funcionario: ")
            var nome = readLine()!!
            println("Qual o salario do funcionario: ")
            var salario = readLine()!!.toDouble()
            var salarioformat = String.format("%.2f", salario)
            var Formatação = "nome: " + nome + " :R$" + salarioformat
            funcionariosHomens.add(Formatação)
            println("Deseja adicionar outro funcionario: (Escreva sim ou nao)")
            var processo = readLine()!!.lowercase()
            if (processo == "sim"){
                continue
            }else{
                break
            }
        }else if (sex == "feminino"){
            println("Qual o nome da funcionaria: ")
            var nome = readLine()!!
            println("Qual o salario da funcionaria: ")
            var salario = readLine()!!.toDouble()
            var salarioformat = String.format("%.2f", salario)
            var Formatação = "nome: " + nome + " :R$" + salarioformat
            funcionariosMulheres.add(Formatação)
            println("Deseja adicionar outro funcionario: ")
            var processo = readLine()!!.lowercase()
            if (processo == "sim"){
                continue
            }else{
                break
            }
        }
    }
    println("Lista dos funcionarios homens: ")
    if (funcionariosHomens.isNotEmpty()){
        for(funcionario in funcionariosHomens){
            println(funcionario)
        }
    }else{
        println("Não há funcionarios homens!!")
    }
    println("Lista das funcionarias mulheres: ")
    if (funcionariosMulheres.isNotEmpty()){
        for (funcionario in funcionariosMulheres) {
            println(funcionario)
        }
    }else{
        println("Não há funcionarios mulheres!!")
    }
}