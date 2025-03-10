fun main() {
    val vetor = IntArray(10)

    for (i in vetor.indices) {
        vetor[i] = (i + 1) * 5
    }
    println(vetor.joinToString(" "))
}
