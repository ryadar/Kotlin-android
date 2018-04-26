package com.raja.kotlin

//importing class and assigning import as variable
import com.raja.kotlin.Demo_One as demo;

//wedo not have static import

//we can import top-level functions and properties; and
//functions and properties declared in object declarations;
//enum constants.


class `3_PackageExample` {


// below ARE Defaults imports
//    kotlin.*
//    kotlin.annotation.*
//    kotlin.collections.*
//    kotlin.comparisons.* (since 1.1)
//    kotlin.io.*
//    kotlin.ranges.*
//    kotlin.sequences.*
//    kotlin.text.*

    fun check(){
        var demo =demo()
        demo.charDeclarations()
    }
}