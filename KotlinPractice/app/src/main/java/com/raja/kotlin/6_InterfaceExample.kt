package com.raja.kotlin

import android.util.Log

interface Vehicle{
    fun engine()
    fun model()
    var ENGINE_NUMBER:String
}

class Car : Vehicle{
    override var ENGINE_NUMBER: String
        get() = "SWIFT-1234567"
        set(value) {}
    override fun engine() {}
    override fun model() {}

}
////////
//resolving conflicts

interface A{
    fun test(){Log.i("Raja","it is from interface A")}
}
interface B{
    fun test(){Log.i("Raja","it is from interface B")}
}

class C:A,B{
    override fun test() {
        super<A>.test()
        super<B>.test()
    }

}


