import java.util.*

fun main(){

    //Pedido de data de nascimento
    print("Enter Year of Birth: ")
    val yearOfBirth = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearInDevice - yearOfBirth

    print("You are $age years old")

}