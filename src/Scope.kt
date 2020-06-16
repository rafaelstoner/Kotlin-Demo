

var name:String?=null

fun showUserInfo(){
    name="Welcome $name"
    println(" $name")

}


fun main() {
    name = "Stoner"
    println(" $name")
    showUserInfo()
    println(" $name")

}