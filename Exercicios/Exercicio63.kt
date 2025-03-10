fun main(){
    var i = 0
    var menorValor = Int.MAX_VALUE
    var sumNum = 0
    var par = 0
    do {
        print("Informe um numero: ")
        var num = readLine()!!.toInt()
        i++
        if (num % 2 == 0) {par++}
        sumNum += num
        if (num < menorValor) {menorValor = num}


        print("Deseja continuar? (S/N) ")
        val continuar = readln()!!.trim().lowercase()
        if (continuar == "n") {break}
    }while (true)
    var media = (sumNum / i).toDouble()
    println("Somatoria de todos os numeros: $sumNum")
    println("O menor numero digitado: $menorValor")
    println("Quantidades de numeros pares digitados digitadas: $par")
    println("Media dos numeros: $media")

}