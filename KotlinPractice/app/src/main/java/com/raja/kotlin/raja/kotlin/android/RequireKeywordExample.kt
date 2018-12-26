package com.raja.kotlin.raja.kotlin.android

/**
 * Created by Ryadar on 12/25/18.
 */


class RequireKeywordExample{
    fun test(){
        var name:String ="Raja"
        require(name.contains("shekar")){
            println("yes")  //throuws IllegaArgumentException
        }
        print("no")
    }


    fun test1(){
        var isLogin:Boolean =  false

        check(isLogin){

            // thows IllegalStateException if values is false

        }


    }
}


