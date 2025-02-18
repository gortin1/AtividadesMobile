fun change(a){
    when(a){
        "1" -> "janeiro"
        "2" -> "Fevereiro"
        "3" -> "Março"
        "4" -> "Abril"
        "5" -> "Maio"
        "6" -> "Junho"
        "7" -> "Julho"
        "8" -> "Agosto"
        "9" -> "Setembro"
        "10" -> "Outubro"
        "11" -> "Novembro"
        "12" -> "Dezembro"
        else -> "Mes desconhecido"
    }
}
fun main() {
    val a = readln().toString()
    val dia = readln().toString()
    /*val mudar =
        when(mes){
            "1" -> "janeiro"
            "2" -> "Fevereiro"
            "3" -> "Março"
            "4" -> "Abril"
            "5" -> "Maio"
            "6" -> "Junho"
            "7" -> "Julho"
            "8" -> "Agosto"
            "9" -> "Setembro"
            "10" -> "Outubro"
            "11" -> "Novembro"
            "12" -> "Dezembro"
            else -> "Mes desconhecido"
        }*/

    //println("Hoje é $dia de $mudar")
    println(change(a))

}
