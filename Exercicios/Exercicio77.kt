fun main(){
    var vetor = Array(7){" "}

    for(i in vetor.indices){
        print("Digite o ${i + 1}° nome: ")
        vetor[i] = readLine()!!
    }
    vetor.reverse()

    for(nome in vetor){
        print("${nome}")
    }
}