fun main(){
    println("Qual tipo de carro você alugou (Luxo ou Popular): ")
    var tipoCarro = readLine()!!.lowercase()
    println("Por quantos dias você alugou? ")
    var dias = readLine()!!.toInt()
    println("Quantos Km você percorreu: ")
    var kmandados = readLine()!!.toInt()

    if (tipoCarro == "luxo"){
        if (kmandados <= 200){
            var valorKm = (0.30 * kmandados).toInt()
            var valorDia = (150 * dias).toInt()
            var valor = (valorKm + valorDia).toDouble()
            var valorFormat = String.format("%.2f", valor)
            println("Você deve pagar R$$valorFormat pelo carro de luxo alugado!!")
        }else{
            var valorKm = (0.25 * kmandados).toInt()
            var valorDia = (150 * dias).toInt()
            var valor = (valorKm + valorDia).toDouble()
            var valorFormat = String.format("%.2f", valor)
            println("Você deve pagar R$$valorFormat pelo carro de luxo alugado!!")
        }
    }else if (tipoCarro == "popular"){
        if (kmandados <= 100){
            var valorKm = (0.20 * kmandados).toInt()
            var valorDia = (90 * dias).toInt()
            var valor = (valorKm + valorDia).toDouble()
            var valorFormat = String.format("%.2f", valor)
            println("Você deve pagar R$$valorFormat pelo carro popular alugado!!")
        }else{
            var valorKm = (0.10 * kmandados).toInt()
            var valorDia = (90 * dias).toInt()
            var valor = (valorKm + valorDia).toDouble()
            var valorFormat = String.format("%.2f", valor)
            println("Você deve pagar R$$valorFormat pelo carro popular alugado!!")
        }
    }else{
        println("Modelo não identificado")
    }
}   