fun main(){
    var homens = mutableListOf<Int>()
    var mulheres = mutableListOf<Int>()
    while (true){
        println("Qual o sexo da pessoa: \n(Digite 'H' para homens e 'M' para mulheres)")
        var sex = readLine()!!.lowercase()
        if (sex == "h"){
            println("Qual a idade deste Homem: ")
            val idade = readLine()!!.toInt()
            homens.add(idade)
            println("Deseja continuar? (Digite 'S' para sim e 'N' para não ")
            val resposta = readLine()!!.lowercase()
            if (resposta == "s"){
                continue
            }else{
                break
            }
        }
        if (sex == "m"){
            println("Qual a idade desta mulher: ")
            val idade = readLine()!!.toInt()
            mulheres.add(idade)
            println("Deseja continuar? (Digite 'S' para sim e 'N' para não ")
            val resposta = readLine()!!.lowercase()
            if (resposta == "s"){
                continue
            }else{
                break
            }
        }
    }
    val maxHomem = homens.max()
    val maxMulheres = mulheres.max()
    if (maxHomem == maxMulheres){
        println("A maior idade de ambos são $maxHomem")
    }else if (maxHomem > maxMulheres){
        println("A maior idade digitada é dos homens sendo $maxHomem")
    }else {
        println("A maior idade digitada é das mulheres sendo $maxMulheres")
    }
    val quantHomens = homens.size
    val mediaHomens = homens.sum() / quantHomens
    val minMulher = mulheres.min()
    val mediaHomensFormat = String.format("%.2f", mediaHomens)
    println("Foram registrados $quantHomens homens")
    println("A mulher mais jovem registrada tem $minMulher anos")
    println("A media de idade entre os homens é de $mediaHomensFormat")
}