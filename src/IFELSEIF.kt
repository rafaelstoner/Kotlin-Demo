


fun main(){



    print("Introduza sua idade")
    val age = readLine()!!.toInt()


    if(age<= 13){

        println("Crianca")

    } else if(age in 14..17){
        println("Adolescente")
    }else if(age in 18..21){
        println("Jovem")
    }else {
        println("Adulto")
    }


    println("Fim do App")


}