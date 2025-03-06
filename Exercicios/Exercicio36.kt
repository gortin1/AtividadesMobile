fun main(){
    println("Digite a quantidade de horas exercitadas:")
    var horas = readLine()!!.toIntOrNull()

    if (horas == null) {
        println("Valor invalido digite um novo valor")
        return
    }

    var pontos = when{
        horas < 10 -> horas * 2
        horas < 20 && horas >= 10 -> horas * 5
        else -> horas * 10
    }
    val dinheiro = pontos * 0.05

    println("Você se exercitou por $horas durante este mes \njuntando $pontos e com isso faturou R$%.2f".format(dinheiro))
}