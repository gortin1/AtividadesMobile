fun main(){
    println("Digite a largura do terreno: ")
    var altura = readLine()!!.toInt()
    println("Digite o comprimento do terreno: ")
    var base = readLine()!!.toInt()
    var area = altura*base
    if (area < 100){
        println("Terreno Popular")
    }else if (area in 100..500){
        println("Terreno Master")
    }else{
        println("Terreno VIP")
    }
}