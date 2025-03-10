fun main(){
    print("Digite a primeira nota: ")
    var nota1 = readLine()!!.toFloat()
    print("Digite a segunda nota: ")
    var nota2 = readLine()!!.toFloat()
    somador(nota1, nota2)
}

fun somador(nota1: Float, nota2: Float){
    var soma = nota1 + nota2
    println("A soma entre $nota1 e $nota2 é: $soma")
}
