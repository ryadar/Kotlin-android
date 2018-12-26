package com.raja.kotlin

import android.util.Log

class Demo_One {

    //    explicity Conversion
    fun conversion() {
        val a: Int = 1 // A boxed Int (java.lang.Integer)
        val b: Long = 10 // implicit conversion yields a boxed Long (java.lang.Long)
        val c: Byte = 1
        val d: Int = c.toInt()
        val e: Byte = a.toByte()
        a.toByte()
        a.toChar()
        a.toDouble()
        a.toFloat()
        a.toInt()
        a.toString()
        a.toShort()

    }

    fun charDeclarations(){
        Log.i("Raja","?????")
        var i:Int=0
        while(i<150){
           Log.i("Raja","Char $i value is\t"+i.toChar())
            i++
        }
    }
}