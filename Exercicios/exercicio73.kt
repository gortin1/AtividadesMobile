fun main(){
    var vetor = IntArray(10)

    for(i in vetor.indices){
        vetor[i] = 9 - i
    }
    print(vetor.joinToString(" "))
}