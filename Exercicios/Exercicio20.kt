fun main(){
    println("Digite um numero: ")
    var numero = readLine()!!.toInt()
    if (numero % 2 == 0){
        println("Esse numero é par")
    }else{
        println("Esse numero é impar")
    }
}