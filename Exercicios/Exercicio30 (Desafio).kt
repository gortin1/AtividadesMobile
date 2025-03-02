fun main(){
    println("Digite o valor da primeira reta: ")
    val reta1 = readLine()!!.toInt()
    println("Digite o valor da segunda reta: ")
    val reta2 = readLine()!!.toInt()
    println("Digite o valor da terceira reta: ")
    val reta3 = readLine()!!.toInt()
    if (reta1 > reta2+reta3 || reta3 > reta2+reta1 || reta2 > reta1+reta3){
        println("Não é possivel ser um triângulo")
    }else{
        println("É possivel ser um triângulo")
        if(reta1 == reta2 && reta3 == reta1){
            println("O triângulo será um triângulo equilátero")
        }else if(reta1 == reta3 || reta2 == reta1 || reta3 == reta2  ){
            println("O triângulo será um triângulo isósceles")
        }else{
            println("O triângulo será um triângulo escaleno")
        }
    }
}