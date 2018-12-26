package com.raja.kotlin

class ArrayExample{
    //Array is class in kotlin and also we have  ByteArray , ShortArray , IntArray .....

    fun arrayExample(){
        var myArray = arrayOf(1,2,3)
        var intArray = intArrayOf(1,2,3,4)

        for(i in myArray ){
            println("Number is $i ")
        }
    }

}