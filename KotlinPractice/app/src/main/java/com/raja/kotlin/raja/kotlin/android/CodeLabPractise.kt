package com.raja.kotlin.raja.kotlin.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.ryadar.kotlinpractice.R
import java.util.*

class CodeLabPractise : AppCompatActivity(), View.OnClickListener {

    var count: Int = 0;
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.random -> callRandom()
            R.id.count -> callCount()
            R.id.toast -> callToast()
        }
    }

    fun callRandom() {
        var random = Random()
        count = random.nextInt(100 - 1 + 1) + 1
        Toast.makeText(applicationContext, "count is: $count", Toast.LENGTH_LONG).show()
    }

    fun callCount() {
        count++
        Toast.makeText(applicationContext, "Random number is : $count", Toast.LENGTH_LONG).show()
    }

    fun callToast() {
        Toast.makeText(applicationContext, "Here is Toast", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.code_lab_layout)
        var toast = findViewById<Button>(R.id.toast)
        var count = findViewById<Button>(R.id.count)
        var random = findViewById<Button>(R.id.random)

        toast.setOnClickListener(this)
        count.setOnClickListener(this)
        random.setOnClickListener(this)


    }

}