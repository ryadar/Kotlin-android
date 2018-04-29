package com.raja.kotlin


// High Order functions takes functions as parameters

class HighOrderFunctions {

    fun test() {
        var a = 2
        println(myMethod(a, { println("Just some dummy function") }))
    }

    fun myMethod(a: Int, func: () -> Unit): Int {
        func()
        return 2 * a
    }
}