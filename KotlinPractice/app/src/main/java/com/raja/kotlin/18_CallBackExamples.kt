package com.raja.kotlin

/**
 * Created by Ryadar on 12/25/18.
 */
class `18_CallBackExamples` {

    fun read() {

        double(10, object : MyInterface {
            override fun doubleOfNumber(double: Int) {
                print("double number $double ")
            }
        })
    }


    fun double(x: Int, action: MyInterface) {


        action.doubleOfNumber(x * x)
    }


}

interface MyInterface {

    fun doubleOfNumber(double: Int)
}