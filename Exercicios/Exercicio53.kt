fun main (){
    var homens = 0
    var mulheres = 0
    var idadeHomens = 0
    var sumIdade = 0
    var mulherMaior20 = 0
    var i = 0
    while (i < 5){
        print("Qual o sexo da pessoa (M/F): ")
        var sexo = readLine()!!.lowercase()
        print("Qual a idade da pessoa: ")
        var idade = readLine()!!.toInt()
        if(sexo == "m"){
            homens++
            idadeHomens+=idade
        }
        if(sexo == "f"){mulheres++}
        if(sexo == "f" && idade >= 20){mulherMaior20++}
        sumIdade+=idade
        i++
    }
    var mediaTotal = (sumIdade/i).toDouble()
    var mediaHomens = (idadeHomens/homens).toDouble()
    println("A quantidade de homens cadastrados foram $homens")
    println("A quantidade de mulheres cadastradas foram $mulheres")
    println("A media do grupo foi de $mediaTotal")
    println("A media dos homens foi de $mediaHomens")
    println("Tiveram $mulherMaior20 mulheres maiores de 20 anos")
}