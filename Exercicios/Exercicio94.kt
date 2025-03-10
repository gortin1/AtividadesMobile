fun main() {
    print("Digite o número de termos para a sequência de Fibonacci: ")
    val termos = readLine()!!.toInt()

    fibonacci(termos)
}

fun fibonacci(termos: Int) {
    var a = 0
    var b = 1
    print("$a >> $b >> ")

    for (i in 3..termos) {
        val c = a + b
        print("$c >> ")
        a = b
        b = c
    }
    println("FIM")
}


