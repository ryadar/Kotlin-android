package com.raja.kotlin

/**
 * Created by Ryadar on 12/30/18.
 */
class `2_1_Map_Example` {


    fun test(){

        var myMpa = mapOf<Int,String>( 1 to "1", 2 to "2")

        var mutableMap = HashMap<Int,String>()

        for (keys in myMpa.keys ){
            print(keys)
            print(myMpa.get(keys))

        }
        for (values in myMpa.values ){
            print(values)
        }

    }
}