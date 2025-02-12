fun main(){
    println("Qual seu nome")
    var nome = readln()
    println("qual seu salario")
    var sal = readln().toDouble()
    var salario = String.format("%.2f",sal)
    println("Ola $nome é um prazer, seu salario de R$$salario")
}
