fun main(){
    println("Digite um primeiro valor: ")
    var valor1 = readLine()!!.toInt()
    println("Digite um segundo valor: ")
    var valor2 = readLine()!!.toInt()
    println("Digite a distancia entre eles valor: ")
    var gap = readLine()!!.toInt()
    while (true){
        if (valor1 != valor2){
            print("$valor1 ")
            valor1 += gap
        }else{
            println("Acabou")
            break
        }
    }
}