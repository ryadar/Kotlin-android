package com.raja.kotlin

import android.util.Log

class ControlFlowExample {

    fun ifExample(a: Int, b: Int) {
        var result: Int
        if (a > b) {
            result = a
        } else {
            result = b
        }

        result = if (a > b) a else b

        result = if (a > b) {
            a
        } else {
            b
        }


    }

    fun forExample(array: Array<String>) {
        for (s in array) {
            Log.i("Raja", "$s")
        }

        for (s in array.indices) {
            Log.i("Raja", "$s")
        }

    }

    fun whileExample() {}
    fun whenExample(a: Any) {
        when (a) {
            2..10 -> Log.i("RAja", "It is Int")
            -1, 0 -> Log.i("RAja", "It is Int")
            1 -> Log.i("RAja", "It is Int")
            "Raja" -> Log.i("RAja", "It is String")
            1.0 -> Log.i("RAja", "It is Floatt")
            1.0F -> Log.i("RAja", "It is Int")
            is String -> Log.i("RAja", "It is Int")
        }
    }

    fun breakAndContinueExample() {
        loop@ for (i in 1..100) {
            for (j in 1..100) {
                if (j == 50) break@loop
            }
        }
    }
}