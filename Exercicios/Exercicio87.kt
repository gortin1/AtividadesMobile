fun main(){
    gerador("Mobile")
}

fun gerador(mensagem: String){
    var linha = "+ ${"=".repeat(mensagem.length)} +"
    println(linha)
    println(mensagem)
    println(linha)
}