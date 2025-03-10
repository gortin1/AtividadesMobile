fun main(){
    print("Digite o numero inicial: ")
    var numero = readLine()!!.toInt()
    print("Digite a razão da PA: ")
    var razao = readLine()!!.toInt()
    var sumNum = 0
    for(i in 1..10){
        print("$numero ")
        sumNum += numero
        numero += razao
    }
    println("\n resultado da soma dos termos: $sumNum")
}