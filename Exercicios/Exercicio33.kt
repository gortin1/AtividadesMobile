fun main(){
    println("Digite o valor da casa: ")
    var valorCasa = readLine()!!.toDouble()
    println("Digite o seu salario: ")
    var valorSalario = readLine()!!.toDouble()
    println("Digite em quantos anos deseja pagar: ")
    var anos = readLine()!!.toInt()
    var maximo = valorSalario * 0.30
    var prestacaoMensal = valorCasa/(12 * anos)
    if(prestacaoMensal>maximo){
        println("Não é possivel realizar o emprestimo, valor excedeu 30% do salario do comprador")
    }else{
        var prestacaoFormat = String.format("%.2f", prestacaoMensal)
        println("As prestações mensais ficaram em $prestacaoFormat")
    }
}