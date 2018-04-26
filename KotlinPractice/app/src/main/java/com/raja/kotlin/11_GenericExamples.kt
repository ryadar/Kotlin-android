package com.raja.kotlin

//Generic Examples
class GenericExamples{
    var value = Box(1).isInteger()

    var value1 =Box("Raja").isString()
}

class Box<T>(t:T){

    var value =t

    fun isInteger():Boolean{
        if(value is Int){
            return true
        }
        return false
    }

    fun isString():Boolean = if(value is String) true else false

}