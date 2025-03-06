fun main(){
    var num = 0
    for(i in 1..7){
        println("Digite o $i :")
        num += readLine()!!.toInt()
    }
    println("Resultado : $num")
}