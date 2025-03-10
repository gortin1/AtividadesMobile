fun main (){
    var i = 0
    var sumIdade = 0
    var maior18 = 0
    var menor5 = 0
    var menorIdade = Int.MAX_VALUE
    while (i < 10){
        print("Digite a idade da pessoa: ")
        var idade = readLine()!!.toInt()
        if (idade >= 18){maior18++}
        if (idade < menorIdade){menorIdade = idade}
        if (idade <= 5){menor5++}
        sumIdade += idade
        i++
    }
    val media = (sumIdade/i).toDouble()

    println("\nTem $menor5 pessoas com menos de 5 anos ")
    println("A media de idade é $media")
    println("A menor idade é $menorIdade")
    println("Tem $maior18 maiores de 18 anos")
}