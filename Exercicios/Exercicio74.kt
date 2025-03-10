fun main(){
    var vetor = IntArray(10)

    for(i in vetor.indices){
        if(i % 2 == 0){
            vetor[i] = 5
        } else{
            vetor[i] = 3
        }
    }
    println(vetor.joinToString(" "))
}