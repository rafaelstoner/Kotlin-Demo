import java.util.*

fun main(){

    //Pedido de data de nascimento
    print("Introduza  o ano de nascimento: ")
    val yearOfBirth = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearInDevice - yearOfBirth

    println("voce tem $age anos de idade ")

}