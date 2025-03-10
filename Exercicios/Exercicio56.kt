fun main(){
    var num = 0
    while(true) {
        println("Digite um valor: ")
        var valor = readLine()!!.toInt()
        if (valor == 1111) {
            break
        }else{
            num = num+valor
            continue
        }
    }
    println("valor final : $num")
}