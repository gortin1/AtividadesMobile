fun main(){
    var par = 0
    var impar = 0
    for(i in 1..6){
        println("Digite o $i numero")
        var num = readLine()!!.toInt()
        if (num % 2 == 0){
            par++
        }else{
            impar++
        }
    }
    println("Numeros par: $par")
    println("Numeros impar: $impar")
}