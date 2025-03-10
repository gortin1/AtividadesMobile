fun main(){
    var i = 0
    var idadesMaior21 = 0
    var idades = 0
    do {
        print("Digite uma idade: ")
        var num = readLine()!!.toInt()
        if (num >= 21) { idadesMaior21++ }
        i++
        idades+=num
        print("Deseja continuar? (S/N) ")
        val continuar = readln()!!.trim().lowercase()
        if (continuar == "n") {break}
    }while (true)
    var media = (idades / i).toDouble()
    println("Pessoas maiores que 21 anos de idade: $idadesMaior21")
    println("Quantidades de idades digitadas: $i")
    println("Media de idade: $media")

}