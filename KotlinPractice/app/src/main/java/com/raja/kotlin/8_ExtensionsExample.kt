package com.raja.kotlin

import android.util.Log

class ExtensionFuntionExample{

    fun changeName(name: String){
       Log.i("Raja", name.appendMyName());
    }

    fun String.appendMyName():String{
        return "Student Name is\t"+ this
    }

}