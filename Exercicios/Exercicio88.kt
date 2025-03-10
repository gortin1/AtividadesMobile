fun main(){
    gerador("aprendendo mobile", 4)
}

fun gerador(mensagem: String, contador: Int){
    var linha = "+ ${"=".repeat(mensagem.length)} +"
    println(linha)
    repeat(contador){
        mensagem.chunked(4).forEach{
            println(it) // it é um nome automático para o único parâmetro em uma lambda.
        }
    }

    println(linha)
}