fun main(){
    println("Digite uma distancia em metros")
    var a = readln()
    var cm = a.toInt() * 100
    var km = a.toInt() / 1000

    println("essa é a conversao da digitada em metros $a distancia em quilometros $km")
    print("\n essa é a conversao da digitada em metros $a distancia em centimetros $cm")
}
