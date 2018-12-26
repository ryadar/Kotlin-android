package com.raja.kotlin

import android.util.Log
import android.view.View
import android.widget.Button

//this is primary constructor with constructor keyword
class ClassExample constructor(name: String) {
    var student = Student("Raja")
    var collegeStudent = CollegeStudent("RajaShekar")
    var bTechStudent = BTechStudent("RajashekarRyada")
    var derived = Derived(1)
}

// This is primary constructor
class Student(name: String) {
    var studentName: String = ""

    var number:Int =1234

    init {
        Log.i("Raja", "This is init block")
        Log.i("Raja", "Student name is \t$name")
        studentName = name
    }

    fun printName() {
        println("Name is $name")
    }
}

//secondary construtor example

class CollegeStudent {
    constructor(name: String) {
        Log.i("Raja", "Student name is \t$name");
    }
}

//combination of primary and secondary constructor
class BTechStudent(name: String) {

    constructor(name: String, number: Int) : this(name) {
            println("name is $name ")
            println("numbe is $number")
    }
}

// open key word example
open class Base(number: Int) {
    open var number: Int
        get() {
            return number
        }
        set(value) {
            number = value
        }

    open fun test() {}
}

class Derived(number: Int) : Base(number) {

    override fun test() {
        number = 1
        super.test()

        var mainClass = MainClass()

        mainClass.number1

        var nestedClass = MainClass.NestedClass()

        nestedClass.test()
        nestedClass.number2


        //iinner  class object creation
        var outerClass = OuterClass()
        var innerClass = outerClass.InnerClass()
        innerClass.number2


    }
}

//getters and setters in kotlin
//var <propertyName>[: <PropertyType>] [= <property_initializer>][<getter>][<setter>]
var name: String
    get() {
        return name
    }
    set(value) {
        name = value
    }

//this is about filed variable
var name1: String = "Raja"
    get() {
        return name1
    }
    set(value) {
        field = value
    }

//Compile Time Constant declaration
const val phoneNumber: Int = 123456789


//nested classes examples

class MainClass {
    var number1: Int = 10

    class NestedClass {
        var number2: Int = 10
        fun test() {
            Log.i("Raja", "This is nested class fun")
            //access number1 is not possible
        }
    }
}

//Inner Class Example
class OuterClass {
    var number1: Int = 10
    fun test() {
        Log.i("Raja", "This is main class fun")
    }

    inner class InnerClass {
        var number2: Int = 10
        fun test() {
            Log.i("Raja", "This is main class fun")
            Log.i("Raja", "Sum of number1 and number 2 is {$number2+$number1}")
        }

    }
}

//Anonymous inner classes class Example

class AnonymousInnerExample {

    fun buttonListner(button: Button) {
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.i("Raja", "Button listner with Anonymous Inner Class")

            }

        })
    }
}

//Enum Classes Example

enum class Direction {
    SOUTH, NORTH, EAST, WEST
}

fun test() {
    Direction.EAST
}


abstract  class MyAbstractClass(){
    abstract  fun testMe()
}