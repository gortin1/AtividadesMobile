fun main(){
    println("Digite o salario atual do funcionario")
    val sal = readln().toDouble()
    val salarioAumento = sal+(sal * 0.15)
    val salario = String.format("%.2f", salarioAumento)
    println("O salario com o aumento é de $salario")
}
