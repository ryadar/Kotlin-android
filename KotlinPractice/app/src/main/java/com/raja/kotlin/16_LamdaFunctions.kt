package com.raja.kotlin

class LamdaFunctionsExample{

    val multipleExample = {x:Int,y:Int->x*y}

    val max ={x:Int,y:Int-> if(x>y)x else y}

//    val mul = {it*10}
    fun test(){
        multipleExample(10,20)
        max(20,30)
    }

    //anonomuous function

    //fun(x:Int,y:Int):Int=x*y
    
}