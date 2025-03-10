fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toFloat()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toFloat()

    val soma = somadorNew(nota1, nota2)
    println("A soma entre $nota1 e $nota2 é: $soma")
}


fun somadorNew(nota1: Float, nota2: Float): Float {
    return nota1 + nota2
}
