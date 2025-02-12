fun main(){
    println("Digite o preço do produto")
    val preco = readln().toDouble()
    val precoDesconto = preco+(preco * 0.05)
    val precoSaida = String.format("%.2f", precoDesconto)
    println("O preço do produto promocional é $precoSaida")
}
