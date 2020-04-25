


fun main(){


    print("Introduza a idade ")
    val age= readLine()!!.toInt()

    if(age in 13..17)
        print("Adolescente")
    if(age in 18..21)
        print("Jovem")
    if(age in 21..45)
        print("Adulto")




    println("Fim do App")


}