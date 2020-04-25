

fun main(){
    // variavel String declarada
    var str:String
    str="Welcome to Kotlin"

    //Variavel String auto detetada
    val name   = "Stoner"
    val age  =20


    println("===== User info ===== ")
    println("Name: $name")
    println("Age: $age"   )



    var count =1
    println("Count: $count")
    count = 10
    println("Count: $count")


    var department:String?
    department = null
    department = "Software Engineering"
    print("Department ${department!!}")


}