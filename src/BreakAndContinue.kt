



fun main(){

    println("Continue Example")
    for (number in 1..10){
        // Se o number for 5, ele retorna ao inicio do loop
        if(number==5){
            continue
        }
        println(number)
    }


    println("Break Example")
    for (number in 1..10){
        //Se o numero for 6, o loop sera terminado
        if(number==6){
            break
        }
        println(number)
    }


    println("Break Inner Example")
    loop@ for (number in 1..10){
        println("number: $number")
        for (innerLoop in 1..7){
            println("innerLoop: $innerLoop")
            if(innerLoop==6){
                break@loop
            }
        }


    }




    println("End App")
}