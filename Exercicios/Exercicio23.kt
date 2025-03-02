fun main(){
    println("Digite seu Sexo: ")
    var genero = readLine()!!.lowercase()
    println("Digite seu Nome: ")
    var nome = readLine()!!.uppercase()
    println("Digite o quanto voce gastou: ")
    var valorCompra = readLine()!!.toDouble()
    if (genero == "mulher"|| genero == "m" ){
        var desconto = 0.13
        var valor = valorCompra * desconto
        var valorFormat = String.format("%.2f", valor)
        var valorDescontado = valorCompra - valor
        var valorDescontadoFormat = String.format("%.2f", valorDescontado)
        println("Olá $nome você gastou: R$$valorCompra \nmas você recebeu um desconto de 13% de dia das mulheres \nPor isso ficou: R$$valorDescontadoFormat economizando assim R$$valorFormat")

    }else if (genero == "homem" || genero == "h"){
        var desconto = 0.05
        var valor = valorCompra * desconto
        var valorFormat = String.format("%.2f", valor)
        var valorDescontado = valorCompra - valor
        var valorDescontadoFormat = String.format("%.2f", valorDescontado)
        println("Olá $nome você gastou: R$$valorCompra \nmas você recebeu um desconto de 5% de dia das mulheres \nPor isso ficou: R$$valorDescontadoFormat economizando assim R$$valorFormat")
    }
}