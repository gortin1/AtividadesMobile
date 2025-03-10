fun main() {
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val num2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val num3 = readLine()!!.toInt()

    val resultadoMaior = maior(num1, num2, num3)
    println("O maior número entre $num1, $num2 e $num3 é: $resultadoMaior")
}

fun maior(num1: Int, num2: Int, num3: Int): Int {
    return maxOf(num1, num2, num3)  // a função maxOf é usada para encontrar o maior número
}


