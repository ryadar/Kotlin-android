package com.raja.kotlin

class ArrayExample{
    //Array is class in kotlin and also we have  ByteArray , ShortArray , IntArray .....

    fun arrayExample(){
        var myArray = arrayOf(1,2,3)
         var myList =listOf<String>("1","2","3")

         var myList1 = mutableListOf<String>("1","2","3")

         var myList2 = ArrayList<String>()

          myList2.add("A")

        var intArray = intArrayOf(1,2,3,4)

        for(i in myArray ){
            println("Number is $i ")
        }
    }


    // filter keyword example
    fun filterExample(){
        var myList = ArrayList<Int>()
        myList.add(1)
        myList.add(2)
        myList.add(3)
        myList.add(4)
        var myNewList = myList.filter { it < 3 }

    }

    fun mapExample(){
        var myList = ArrayList<Int>()
        myList.add(1)
        myList.add(2)
        myList.add(3)
        myList.add(4)

        var myNewList = myList.map { it * it  }
        var myNewList1 = myList.map { it + it  }

    }

}