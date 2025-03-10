fun main() {
    val vetor = IntArray(8)

    for (i in vetor.indices) {
        if (i % 2 == 0) {
            vetor[i] = 999
        } else {
            vetor[i] = i / 2
        }
    }
    println(vetor.joinToString(" "))
}
