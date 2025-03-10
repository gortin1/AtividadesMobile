import kotlin.random.Random

fun main() {
    val vetor = IntArray(7)

    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(0, 101)  // os números vão ser gerados de 0 a 101
    }


    println(vetor.joinToString(" "))
}
