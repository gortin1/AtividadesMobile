fun main(){
    var primeiro = 0
    var segundo = 1
    println("Estes são os 10 primeiros termos da sequencia de Fibonacci")
    for(i in 1..10){
        print("$primeiro ")
        val proximo = primeiro + segundo
        primeiro = segundo
        segundo = proximo
    }
    print("Acabou!")
}