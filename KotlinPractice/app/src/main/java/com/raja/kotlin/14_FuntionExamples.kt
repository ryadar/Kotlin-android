package com.raja.kotlin

import android.util.Log

class FuntionExample{
    fun test(){
        defaultArguments()
        defaultArguments("Shekar")
        defaultArguments("ryada",12)
    }

    //default arguments
    fun defaultArguments(name:String="Raja",number: Int=123456789){

    }

    //varargs example
    fun varArgsExample(vararg names:String){
        for(name in names){
            Log.i("Raja","??????????/")
        }
    }
 // Unit Returns nothig
    fun unitReturnsExample():Unit{

 }
    //single expression funtion
    fun test1(x:Int):Int = x*x


    // inlifix notation example
//    1. should be extension function
//    2. must single arguments
//    3. must not have default values
//    4. must not have varargs

    infix  fun String.myString(value:String){
             Log.i("Raja",this)
    }
        fun print(){
            //calling infix  functions
            "This is my" myString  "Raja"
        }
///// example to have functions inside of functions
    fun outerFunction(){

            fun innerFunction(){

            }
    }
 // Generic Functions
    fun <T> testMyString(item :T){
        when (item){
            item  is String-> "This is String"
            item  is Int-> "This is Int"
            item  is Short-> "This is Short"
            item  is Byte-> "This is Byte"
            item  is Float-> "This is Float"
            item  is Double-> "This is Double"
        }
    }
}