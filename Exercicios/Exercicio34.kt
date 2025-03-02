fun main(){
    println("Digite sua altura: ")
    var altura = readLine()!!.toDouble()
    println("Digite seu peso: ")
    var peso = readLine()!!.toInt()
    var imc = (peso/(altura*altura))
    var imcFormat = String.format("%.1f", imc)
    if (imc < 18.5){
        println("Seu Imc é de : $imcFormat e você esta abaixo do peso")
    }else if(imc in 18.5..24.9){
        println("Seu Imc é de : $imcFormat e você esta no peso ideal")
    }else if(imc in 25.0..29.9){
        println("Seu Imc é de : $imcFormat e você esta com sobrepeso")
    }else if(imc in 30.0..40.0){
        println("Seu Imc é de : $imcFormat e você esta com obesidade")
    }else{
        println("Seu Imc é de : $imcFormat e você esta com obesidade morbida")
    }
}