fun main(){
    println("Digite a distancia em Km que deseja percorrer: ")
    var distancia = readLine()!!.toInt()
    if (distancia <= 200){
        val valor = distancia * 0.50
        println("Você percorrera $distancia e pagara R$$valor")
    }else{
        val valor = distancia * 0.45
        println("Você percorrera $distancia e pagará $valor")
    }
}