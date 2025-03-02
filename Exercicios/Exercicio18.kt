fun main(){
    println("Qual o ano de seu nascimento ?")
    val ano = readln().toInt()
    val idade = 2025 - ano
    if(idade in 18..69){
        println("Você é obrigado a votar")
    }else if (idade >= 70 || idade in 16..17){
        println("Você não é obrigado a votar")
    }else{
        println("Você nao tem idade para votar")
    }
}