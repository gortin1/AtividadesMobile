fun main() {
    var mulheres = 0
    var homens100kg = 0
    var pesomulheres = 0
    var maiorPesoHomens = 0

    for (i in 0..8) {
        print("Informe o sexo (M/F): ")
        var sexo = readLine()!!.lowercase()
        print("Informe o peso: ")
        var peso = readLine()!!.toInt()
        if (sexo == "f"){
            mulheres++
            pesomulheres+= peso
        }
        if (sexo == "m" && peso >= 100){homens100kg++}
        if (sexo == "m" && peso > maiorPesoHomens){maiorPesoHomens = peso}
    }
    val media = (pesomulheres/mulheres).toFloat()
    println("Quantidade de mulheres registradas: $mulheres")
    println("Quantidade de homens que pesam mais que 100kg: $homens100kg")
    println("A media de peso entre as mulheres: %.1f".format(media))
    println("O maior peso registrado foi de: ${maiorPesoHomens}Kg")
}
