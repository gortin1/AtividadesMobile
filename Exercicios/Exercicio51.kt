fun main (){
    var i = 0
    var maiorValor = 0
    var menorValor = Int.MAX_VALUE
    while (i < 8){
        print("Digite o valor do produto: ")
        var valor = readLine()!!.toInt()
        if (valor > maiorValor){maiorValor = valor}
        if (valor < menorValor){menorValor = valor}
        i++
    }
    println("O menor valor é $menorValor")
    println("O maior valor é $maiorValor")
}