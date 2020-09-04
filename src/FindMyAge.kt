import java.util.*

fun main(){

    //Pedido de nome
    print("Qual é o teu nome?: ")
    val nome = readLine()

    //Pedido do ano de nascimento
    print("Em que ano você nasceu? : ")
    val yearOfBirth = readLine()!!.toInt()

    //Capturando o ano atual
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)

    //Calculo da idade atual
    val age = yearInDevice - yearOfBirth

    //Imprimir o nome e a idade do usuário
    println("$nome ,voce tem $age anos de idade ")

}