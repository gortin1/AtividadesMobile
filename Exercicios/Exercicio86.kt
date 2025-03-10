fun main(){
    gerador()
}

fun gerador(){
    var hello = "Hello World";
    var linha = "+ ${"=".repeat(hello.length)} +"
    println(linha)
    println(hello)
    println(linha)
}