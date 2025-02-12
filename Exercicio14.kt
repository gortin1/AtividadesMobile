fun main(){
    println("Digite os quilometros rodados")
    val kmRodado = readln().toInt()
    println("Digite os dias alugado")
    val diasAlugado = readln().toInt()
    val precoTotal = (kmRodado * 0.20) + (diasAlugado * 90)
    val preco = String.format("%.2f", precoTotal)
    println("O total a pagar do veiculo sera de $preco")
}
