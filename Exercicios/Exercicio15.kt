fun main(){
    println("Digite seus dias trabalhados")
    val diasTrab = readln().toInt()
    val sal = (25*8)*diasTrab
    val salario = String.format("%.2f", sal)
    println("o seu salario será de $salario")
}
