fun main(){
    println("Digite a velocidade que estava o veiculo")
    var velocidade =  readln().toInt()
    if(velocidade < 80){
        println("Velocidade dentro dos limites")
    }else{
        var multa = ((velocidade - 80)* 5).toDouble()
        var multaFormat = String.format("%.2f", multa)
        println("Você foi multados ${multaFormat}")
    }
}