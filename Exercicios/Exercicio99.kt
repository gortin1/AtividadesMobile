fun main() {
    print("Digite a base: ")
    var base= readLine()!!.toInt()
    print("Digite o expoente: ")
    var expoente = readLine()!!.toInt()
    print("Resultado de $base elevado a $expoente é igual a: ${potencia(base, expoente)}")
}

fun potencia(base: Int, expoente: Int): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}
