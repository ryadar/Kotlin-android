package com.raja.kotlin

class ObjectDeclationExample{

    fun test(){
        SingleTon.number=10000
    }

    fun test1(){
        SingleTon.number=10001111
    }

    fun test2(){
        MyClass.phoneNumber
        MyClass.test()


    }
}

object SingleTon{
    var number:Int=10;
}

//COmpanion Object
class MyClass{
    companion  object{
        var phoneNumber:Int =987654321
        fun test(){

        }
    }
}
//COmpanion Object
class MyClass1{
    companion  object MyClass2{
        var phoneNumber:Int =987654321
        fun test(){

        }
    }
}
