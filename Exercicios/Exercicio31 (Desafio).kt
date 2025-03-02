fun main() {
    while(true) {
        println("Jogador 1 escolha entre Papel(1) - Pedra(2) - Tesoura(3)")
        var jogada1 = readLine()!!.toInt()
        println("Jogador 2 escolha entre Papel(1) - Pedra(2) - Tesoura(3)")
        var jogada2 = readLine()!!.toInt()

        if (jogada1 !in 1..3 || jogada2 !in 1..3) {
            println("Jogada inválida! Escolha entre Papel(1) - Pedra(2) - Tesoura (3)")
            continue
        }

        if (jogada1 == jogada2) {
            println("Deu empate!!")
            continue
        }
        if (jogada1 == 1 && jogada2 == 2 || jogada1 == 2 && jogada2 == 3 || jogada1 == 3 && jogada2 == 1) {
            println("Jogador 1 ganhou!!")
        } else {
            println("Jogador 2 ganhou!!")
        }
        break

    }
}