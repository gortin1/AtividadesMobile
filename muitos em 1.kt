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
    var a = readln()
    var b = readln()
    var c = a.toInt() - b.toInt()
    println("o resultado da soma dos dois valores $a e $b é de $c")
}
fun exercicio5(){
    println("Digite 2 valores abaixo")
    var a = readln()
    var b = readln()
    var c = (a.toDouble() + b.toDouble())/2
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
    
}
fun main() {
    println(exercicio10())

}