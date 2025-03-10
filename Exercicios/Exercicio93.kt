fun main() {
    print("Digite o valor de início: ")
    val inicio = readLine()!!.toInt()

    print("Digite o valor de fim: ")
    val fim = readLine()!!.toInt()

    print("Digite o valor do incremento: ")
    val incremento = readLine()!!.toInt()

    contador(inicio, fim, incremento)
}

fun contador(inicio: Int, fim: Int, incremento: Int) {
    var i = inicio
    while (i <= fim) {
        print("$i >> ")
        i += incremento
    }
    println("FIM")
}
