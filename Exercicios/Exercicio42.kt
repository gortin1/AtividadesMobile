fun main(){
    println("Digite um numero: ")
    var limite = readLine()!!.toInt()
    var i = 0
    while (true){
        if (i == limite){
            print(limite)
            println(" Acabou")
            break
        }else{
            print("$i ")
            i++
        }
    }
}