fun main(){
    println("digite quantos dolares deseja ver a conversao")
    var a = readln()
    var reais = a.toDouble()*5.79
    var euro = a.toDouble()*0.97
    var realFormat = String.format("%.2f", reais)
    var euroFormat = String.format("%.2f", euro)
    println("A conversão do valor $a para reais é $realFormat")
    println("A conversão do valor $a para euro é $euroFormat")
}
