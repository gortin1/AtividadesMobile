fun main(){
    println("Digite a sua primeira nota: ")
    var nota1 = readLine()!!.toDouble()
    println("Digite a sua segunda nota: ")
    var nota2 = readLine()!!.toDouble()
    var mediaNota = (nota1 + nota2)/2
    if (mediaNota > 7.00){
        println("Parabens voce teve um aproveitamento de: $mediaNota")
    }else{
        println("Que pena seu aproveitamento foi de: ${mediaNota}")
    }
}