fun main (){
    var num = 0
    var i = 0
    while (true){
        println("Digite a idade do aluno: ")
        val idade = readLine()!!.toInt()
        if (idade == 999){
            break
        }else{
            num += idade
            i++
            continue
        }
    }
    var media = (num/i)
    println("a media de idade da turma é $media e tem $i alunos na sala")
}