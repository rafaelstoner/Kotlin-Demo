
fun main(){

    val arraylist = ArrayList<String>()
    arraylist.add("Rafa")
    arraylist.add("Stoner")

    println("Second name: "+arraylist.get(1))

    println("All elements")
    for(item in arraylist){
        println(item)
    }
    //Replace
    arraylist.set(0, "King")
    println("First element: "+arraylist.get(0))

    //Search
    if(arraylist.contains("Stoner")){
        println("Name found")
    }else
        println("Name not found")
}