package com.ryadar.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.raja.kotlin.Demo_One
import com.raja.kotlin.ExtensionFuntionExample
import com.raja.kotlin.Main

class MainActivity : AppCompatActivity() {
    var main:Main= Main()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        main.printString("Raja",12345)
//        main.checkObject()
        //main.forLoopExample()
//        Demo_One().charDeclarations()
            ExtensionFuntionExample().changeName("RAJA")
        ExtensionFuntionExample().changeName("Shekar")
        ExtensionFuntionExample().changeName("Sagarika")

        var button=findViewById<Button>(R.id.button)
        
        button.setOnClickListener( object : View.OnClickListener {
            override fun onClick(v: View?) {
            }

        })

    }

}
