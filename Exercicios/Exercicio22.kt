fun main(){
    println("Digite sua data de nascimento: ")
    var ano = readLine()!!.toInt()
    var idade = 2025 - ano
    if (idade > 18){
        var idade2 = idade - 18
        if (idade2>1){println("Você ja fez o alistamento e foi há $idade2 anos atras!")}else{println("Você ja fez o alistamento e foi há $idade2 anos atras!")}
    }else if (idade == 18){
        println("Este é o ano que voce tem que se alistar!!")
    }else{
        var idade2 = 18 - idade
        if (idade2 > 1){println("Ainda faltam $idade2 anos para voce poder se alistar")}else{println("Ainda faltam $idade2 ano para voce poder se alistar")}
    }
}