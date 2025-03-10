fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toFloat()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toFloat()

    val resultadoMedia = media(nota1, nota2) 
    println("A média entre $nota1 e $nota2 é: $resultadoMedia")
}

fun media(nota1: Float, nota2: Float): Float {
    return (nota1 + nota2) / 2
}

