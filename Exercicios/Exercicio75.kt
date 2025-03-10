fun main(){
    var vetor = IntArray(15)
    var a = 1
    var b = 1


    for(i in vetor.indices){
        var c = a
        a = b
        b = c + b
        vetor[i] = c
    }
    print(vetor.joinToString(" "))
}