package com.raja.kotlin

import android.util.Log
import kotlin.math.log
import kotlin.properties.Delegates

class LazyDelegationExample {
    val name: String by lazy {
        "Raja"
        "Shekar"
    }
    fun print() {
        Log.i("Raja", "first time" + name) //print raja
        Log.i("Raja", "second time" + name) //print shekar
        Log.i("Raja", "second time" + name) //print shekar
    }
}

class ObservableExample{
    val name :String by Delegates.observable("init valu"){
        prop,old,new ->
        Log.i("Raja", "old value" + old) //print raja
        Log.i("Raja", "new value" + new) //print raja
    }

    fun test(){
        Log.i("Raja","$name")
        Log.i("Raja","$name")
        Log.i("Raja","$name")
    }
}

//map delegate
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}
class MyClass123 {
    fun test() {
        val user = User(mapOf(
                "name" to "John Doe",
                "age" to 25
        ))
    }
}
