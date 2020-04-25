


fun main(){

    print("Introduza a idade: ")
    val age = readLine()!!.toInt()

    if(age >=18){
        println("Pode concorrer para o emprego")
    }else{
        println("Nao tem idade para o emprego")
    }

    print("Fim do app")

}