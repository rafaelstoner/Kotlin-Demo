
fun main(){

    val arraylist = ArrayList<String>()
    arraylist.add("Rafa")
    arraylist.add("Stoner")

    println("Second name: "+ arraylist[1])

    println("All elements")
    for(item in arraylist){
        println(item)
    }
    //Replace
    arraylist[0] = "King"
    println("First element: "+ arraylist[0])

    //Search
    if(arraylist.contains("Stoner")){
        println("Name found")
    }else
        println("Name not found")

}