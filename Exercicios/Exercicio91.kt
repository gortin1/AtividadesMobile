fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    maior(valor1, valor2)
}

fun maior(valor1: Int, valor2: Int) {
    if (valor1 > valor2) {
        println("O maior valor é: $valor1")
    } else if (valor2 > valor1) {
        println("O maior valor é: $valor2")
    } else {
        println("Os valores são iguais!")
    }
}


