fun main(){
    println("Digite a primeira nota: ")
    var nota1 = readLine()!!.toInt()
    println("Digite a segunda nota: ")
    var nota2 = readLine()!!.toInt()
    var media = (nota1-nota2)/2
    if (media in 5..6.9){
        println("Recuperação com media $media")
    }else if (media in 7..10){
        println("Aprovado com media $media")
    }else{
        println("Reprovado com media $media")
    }
}