fun main(){
    println("Digite o valor da primeira reta: ")
    val reta1 = readLine()!!.toInt()
    println("Digite o valor da segunda reta: ")
    val reta2 = readLine()!!.toInt()
    println("Digite o valor da terceira reta: ")
    val reta3 = readLine()!!.toInt()
    if (reta1 > reta2+reta3 || reta3 > reta2+reta1 || reta2 > reta1+reta3){
        println("Não é possivel ser um triangulo")
    }else{
        println("É possivel ser um triangulo")
    }

}