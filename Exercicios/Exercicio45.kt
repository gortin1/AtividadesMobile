fun main() {
    while (true) {
        println("Digite um primeiro valor: ")
        var valor1 = readLine()!!.toInt()
        println("Digite um segundo valor: ")
        var valor2 = readLine()!!.toInt()
        println("Digite a distância entre eles: ")
        var gap = readLine()!!.toInt()

        if (valor1 > valor2) {
            println("Erro!! O primeiro valor deve ser menor que o segundo. Tente novamente.")
            continue
        }
        while (valor1 <= valor2) {
            print("$valor1 ")
            valor1 += gap
        }

        println("\nAcabou")
        break
    }
}
