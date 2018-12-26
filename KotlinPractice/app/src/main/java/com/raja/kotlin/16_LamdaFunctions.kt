package com.raja.kotlin

class LamdaFunctionsExample {

    val multipleExample = { x: Int, y: Int -> x * y }

    val max = { x: Int, y: Int -> if (x > y) x else y }

    //    val mul = {it*10}
    fun test() {
        multipleExample(10, 20)
        max(20, 30)
    }

    //anonomuous function

    //fun(x:Int,y:Int):Int=x*y


    var getMyData: (Int, String) -> String = { x, y -> "Data is $x and $y" }


    fun printMessgae(x: Int, action: (Int, String) -> String) {

        action(x, "This")

    }

    fun test1() {

        printMessgae(10, getMyData)

        printMessgae(10, { x, y -> "Data is $x and $y" })

        printMessgae(10) { x, y -> "Data is $x and $y" }

    }

    // it key word exampme
    var reverse: (String) -> String = { it.reversed() }

    fun reverseString(x: String, action: (String) -> String) {
        action(x)
    }


    //with keyword examples

    fun testWithKeyword() {

        var testNyClass = Student("Raja")

        with(testNyClass) {
            studentName = "raja shekar RYada"
            number = 51551591
        }
    }

    fun applyExample(){
        var testNyClass = Student("Raja")

        testNyClass.apply {

            studentName = "raja shekar RYada"
            number = 51551591
        }.printName()

    }
}