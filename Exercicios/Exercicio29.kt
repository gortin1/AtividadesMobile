fun main(){
    println("Digite o seu nome: ")
    var nome = readLine()!!
    println("Digite o seu salario: ")
    var salario = readLine()!!.toDouble()
    println("Digite a quantos anos voce trabalha: ")
    var tempo = readLine()!!.toInt()
    if (tempo < 3){
        var salarioreajuste = salario + (salario*0.03)
        var salarioFormat = String.format("%.2f", salario)
        var salarioReajusteFormat = String.format("%.2f", salarioreajuste)
        println("Olá $nome apos voce trabalhar por $tempo anos \nfizemos um reajuste no seu salaro\nDe R$$salarioFormat \nVai para R$$salarioReajusteFormat ")
    }else if(tempo in 3..10){
        var salarioreajuste = salario + (salario*0.125)
        var salarioFormat = String.format("%.2f", salario)
        var salarioReajusteFormat = String.format("%.2f", salarioreajuste)
        println("Olá $nome apos voce trabalhar por $tempo anos \nfizemos um reajuste no seu salaro\nDe R$$salarioFormat \nVai para R$$salarioReajusteFormat ")
    }else{
        var salarioreajuste = salario + (salario*0.20)
        var salarioFormat = String.format("%.2f", salario)
        var salarioReajusteFormat = String.format("%.2f", salarioreajuste)
        println("Olá $nome apos voce trabalhar por $tempo anos \nfizemos um reajuste no seu salaro\nDe R$$salarioFormat \nVai para R$$salarioReajusteFormat ")

    }
}