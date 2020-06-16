
/*
mutable: you can update, add more
im-mutable : you cannot update, you cannot add more
 */

fun main(){

    //1- list

    //im-mutable
    val listImmutable = listOf("Rafa","Stoner")
    for (name in listImmutable){
        println(name)
    }

    //mutable
    var listMutable = mutableListOf("Rafa","Stoner")
    listMutable[0]="Daniel"
    for (name in listMutable){
        println(name)
    }


    val listOfUsersI = mapOf(1 to "Rafa", 2 to "Stoner")

    var listOfUsersM = mutableMapOf(1 to "Rafa", 2 to "Stoner")







}