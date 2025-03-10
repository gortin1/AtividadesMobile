fun main(){
    var vetor = IntArray(15)

    for(i in vetor.indices){
        print("Digite o ${i+1}° número: ")
        vetor[i] = readLine()!!.toInt()
    }
    for(numeros in vetor){
        println(numeros)
    }

    println("Posições que são multiplos de 10: ")
    for(numero in vetor.indices){
        if(vetor[numero] % 2 == 0){
            println("O número ${vetor[numero]} é par e está na posição ${numero + 1}")
        }
    }

}