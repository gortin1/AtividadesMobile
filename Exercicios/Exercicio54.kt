fun main(){
    var sumAltura : Double = 0.00
    var i = 0
    var pesoMaior90kg = 0
    var pessoasPequenas = 0
    var pessoaMaior = 0

    while(i < 7){
        print("Informe o peso: ")
        var peso = readLine()!!.toInt()
        print("Informe a altura:(Ex: 180) ")
        var altura = readLine()!!.toInt()
        if (peso>=90){pesoMaior90kg++}
        if (peso>= 100 && altura > 190){pessoaMaior++}
        if (peso <= 50 && altura < 160){pessoasPequenas++}
        sumAltura += altura
        i++
    }

    var media : Float = ((sumAltura/i)/100).toFloat()
    println("\nA media de altura é $media")
    println("$pesoMaior90kg pessoas pesam mais que 90kg")
    println("$pessoasPequenas pessoas pesam menos que 50kg e tem menos de 1.60m")
    println("$pessoaMaior pessoas que pesam mais que 100kg e tem mais que 1.90m")

}