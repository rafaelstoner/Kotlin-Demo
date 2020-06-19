package oop.legacy
//Overriding process

//the inherited class must have the "open" value
open class Operations1 {

    //the overrode method must have the "open" value
    open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n1/n2
    }
}

class  MultiOperations1 : Operations1() {

    //override function
    override fun sum(n1:Int,n2:Int):Int{
        return n1+n2*3
    }
    fun sub(n1:Int,n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
}


fun main(){

    //first
    val op= Operations1()
    var sum=op.sum(10,15)
    println("sum:$sum")
    var div= op.div(12,11)
    println("div:$div")

    // second
    val op2= MultiOperations1()
    sum=op2.sum(10,15)
    println("sum:$sum")
    div= op2.div(12,11)
    println("div:$div")
    val sub=op2.sub(10,5)
    println("sub: $sub")
    val mul=op2.mul(5,5)
    println("mul: $mul")


}