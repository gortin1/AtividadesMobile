fun main() {
    print("Digite um valor: ")
    val num = readLine()!!.toInt()

    println("Tabuada do $num:")
    for (i in 0..10) {
        println("$num x $i = ${num * i}")
    }
}
