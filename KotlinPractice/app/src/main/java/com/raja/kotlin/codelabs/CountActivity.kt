package com.raja.kotlin.codelabs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.ryadar.kotlinpractice.R
import java.util.*

/**
 * Created by Ryadar on 12/30/18.
 */
class CountActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        var coundID = findViewById<Button>(R.id.countID)
        var randomID = findViewById<Button>(R.id.randomID)
        var toastID = findViewById<Button>(R.id.toastID)
        var counterTextView = findViewById<TextView>(R.id.counterTextView)

        coundID.setOnClickListener {
            count = count + 1
            counterTextView.text = count.toString()
        }

        randomID.setOnClickListener {
            var randon = Random()
            count = randon.nextInt()
            counterTextView.text = count.toString()
        }

        toastID.setOnClickListener {
            Toast.makeText(applicationContext, "Current count is $count", Toast.LENGTH_LONG).show()
        }
    }

}