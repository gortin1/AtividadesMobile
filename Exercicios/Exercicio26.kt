fun main(){
    println("Digite um numero: ")
    var num1 = readLine()!!.toInt()
    println("Digite outro numero: ")
    var num2 = readLine()!!.toInt()
    if (num1 > num2){
        println("O $num1 é maior que $num2")
    }else if (num1 < num2){
        println("O $num2 é maior que $num1")
    }else{
        println("Não existe valor maior, os dois são iguais")
    }
}