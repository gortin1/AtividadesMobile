import kotlin.random.Random
fun main() {
    var i = 4
    var numero = Random.nextInt(1,10)
    while (i != 0) {
        println("Tente advinhar o numero:")
        var guess = readLine()!!.toInt()
        if (guess == numero){
            println("VOCÊ GANHOU!!!")
            break
        }else{
            i -= 1
            println("Você tem ainda $i tentativas")
            continue
        }
    }
    if (i==0){
        println("Você perdeu :( ")
    }
}