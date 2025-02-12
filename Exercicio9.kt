fun main(){
    println("digite quantos dolares deseja ver a conversao")
    var a = readln()
    var reais = a.toDouble()*5.79
    var euro = a.toDouble()*0.97

    println("A conversão do valor $a para reais é $reais")
    println("A conversão do valor $a para euro é $euro")
}
