fun main() {
    print("Digite um valor: ")
    val num = readLine()!!.toInt()

    for (i in 0..num) {
        print("$i ")
    }
    print("Acabou ")
}
