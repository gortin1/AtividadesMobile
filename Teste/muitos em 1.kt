fun exercicio1(){
    println("Hello world")
}
fun exercicio2(){
    println("Qual seu nome")
    var nome = readln()
    println("olá $nome é um prazer conhecer")

}
fun exercicio3(){
    println("Qual seu nome")
    var nome = readln()
    println("qual seu salario")
    var sal = readln().toDouble()
    var salario = String.format("%.2f",sal)
    println("Ola $nome é um prazer, seu salario de R$$salario")
}
fun exercicio4(){
    println("Digite 2 valores abaixo")
    var a = readln().toInt()
    var b = readln().toInt()
    var c = a- b
    println("o resultado da soma dos dois valores $a e $b é de $c")
}
fun exercicio5(){
    println("Digite 2 valores abaixo")
    var a = readln().toDouble()
    var b = readln().toDouble()
    var c = (a + b)/2
    println("o resultado da media dos dois valores $a e $b é de $c")
}
fun exercicio6(){
    println("Digite um valor abaixo")
    var a = readln()
    var ante = a.toInt()+1
    var depois = a.toInt()-1
    println("o valor sucessor a $a é $depois e o posterior é $ante")
}
fun exercicio7(){
    println("digite um valor")
    var a = readln()
    var dobro = a.toFloat() * 2
    var terço = a.toFloat()/3
    println("o dobro do numero $a é $dobro")
    println("ja a terça parte do numero $a é $terço")
}
fun exercicio8(){
    println("Digite uma distancia em metros")
    var a = readln()
    var cm = a.toInt() * 100
    var km = a.toInt() / 1000

    println("essa é a conversao da digitada em metros $a distancia em quilometros $km")
    println("essa é a conversao da digitada em metros $a distancia em centimetros $cm")
}
fun exercicio9(){
    println("digite quantos dolares deseja ver a conversao")
    var a = readln()
    var reais = a.toDouble()*5.79
    var euro = a.toDouble()*0.97

    println("A conversão do valor $a para reais é $reais")
    println("A conversão do valor $a para euro é $euro")
}
fun exercicio10(){
    println("Digite a altura da parede")
    var a = readln().toInt()
    println("Digite a largura")
    var b = readln().toInt()
    var area = a * b
    var baldes = area / 2
    println("Sera necessario $baldes baldes de tinta para pintar")
}
fun exercicio11(){
    println("Digite os valores de A, B, C")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val delta = (b*b) - 4 * a * c

    println("o delta é de $delta")
}
fun exercicio12(){
    println("Digite o preço do produto")
    val preco = readln().toDouble()
    val precoDesconto = preco+(preco * 0.05)
    val precoSaida = String.format("%.2f", precoDesconto)
    println("O preço do produto promocional é $precoSaida")
}
fun exercicio13(){
    println("Digite o salario atual do funcionario")
    val sal = readln().toDouble()
    val salarioAumento = sal+(sal * 0.15)
    val salario = String.format("%.2f", salarioAumento)
    println("O salario com o aumento é de $salario")
}
fun exercicio14(){
    println("Digite os quilometros rodados")
    val kmRodado = readln().toInt()
    println("Digite os dias alugado")
    val diasAlugado = readln().toInt()
    val precoTotal = (kmRodado * 0.20) + (diasAlugado * 90)
    val preco = String.format("%.2f", precoTotal)
    println("O total a pagar do veiculo sera de $preco")
}
fun exercicio15(){
    println("Digite seus dias trabalhados")
    val diasTrab = readln().toInt()
    val sal = (25*8)*diasTrab
    val salario = String.format("%.2f", sal)
    println("o seu salario será de $salario")
}
fun exercicio16(){
    println("Digite a quantidade de cigarros que você fuma por dia ")
    val cigarros = readln()
    println("Digite a quantos anos você fuma ")
    var tempoFumado = readln()
    var diasFumado: Int = 365 * tempoFumado.toInt()
    var tempoPerdido = ((10*(cigarros.toInt() * diasFumado))/60)/24

    println("Voce perdeu num total de $tempoPerdido dias de vida")
}
fun main() {
    println(exercicio11())

}
