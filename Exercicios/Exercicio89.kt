
fun main(){
    gerador("aprendendo mobile", 5, 4)
}

fun gerador(mensagem: String, borda: Int, contador: Int){
    var linha:String = ""
    when(borda){
        1-> {
             linha = "+ ${"=".repeat(mensagem.length)} +"
        }
        2-> {
             linha = "~ ${":".repeat(mensagem.length)} ~"
        }
        3->{
             linha = "< ${"-".repeat(mensagem.length)} >"
        }else->{
            println("Número invalido!")
            println("Criando borda padrão")
            linha = "- ${"-".repeat(mensagem.length)} -"
        }


        }
        println(linha)
        repeat(contador) {
            mensagem.chunked(4).forEach {
                println(it) // it é um nome automático para o único parâmetro em uma lambda.
            }
        }

        println(linha)

}


