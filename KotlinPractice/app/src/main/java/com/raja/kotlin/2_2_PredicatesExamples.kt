package com.raja.kotlin

/**
 * Created by Ryadar on 12/30/18.
 */

// it returns true or false
// any
//all
//count
//find

class PredicaatersExample{


    fun anyExample(){
        var list = arrayListOf<Int>(1,2,3,4,5,6)

        var var1 = list.all { it < 10 } // if all elemets less than 10 , returns true or false

        var var2 = list.any { it < 10 } // if any elemets less than 10 , returns true or false

        var var3 = list.count { it < 10 } // if any elemets less than 10 , returns true or false

        var var4 :Int? = list.find { it < 10 } // if finds , returns first element






    }

}