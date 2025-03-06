fun main(){
    var i = 0
    while (true){
        if (i == 30){
            println(" Acabou")
            break
        }else{
            if (i % 4 == 0){
                print("[$i] ")
                i++
            }else{
                print("$i ")
                i++
            }
        }
    }
}