fun main(){
    println("Digite algum ano: ")
    var ano = readln().toInt()

    if (ano % 4 == 0 && ano % 100 != 0){
        println("O ano $ano é bissexto")
    }else if(ano % 100 == 0 && ano % 400 == 0){
        println("O ano $ano é bissexto")
    }else{
        println("O ano $ano não é bissexto")
    }
}