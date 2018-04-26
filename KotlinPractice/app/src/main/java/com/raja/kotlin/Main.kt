package com.raja.kotlin

import android.util.Log

class Main {
    //class simple name
    private val TAG:String ="Raja"// Main::class.qualifiedName.toString();
    //Sample Function
     fun printString(name:String,number:Int):String{
        Log.i(TAG,"name\t$name")
        Log.i(TAG,"number\t$number")
        return ""
    }

    fun checkObject(){
        var obj=Students()
        // checking instance of
        if(obj is Students){
            Log.i(TAG,"$obj is object of Student class")
        }
    }

    // for loop example
    fun forLoopExample(){
        var list = listOf<String>("1","2","3")
        for( s in list){
            Log.i(TAG,"item $s")
        }
        for( s in list.indices){
            Log.i(TAG,"item ${list[s]}")
        }
    }

    }