package com.raja.kotlin.raja.kotlin.android

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.raja.kotlin.ObjectDeclationExample
import com.raja.kotlin.Singleton
import com.ryadar.kotlinpractice.R

class MyFragment() : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var myView:View= inflater.inflate(R.layout.fragment_example, null)

        Singleton.test()

        if (this.arguments != null) {
            var name: String = arguments!!.getString("MyKey", "There is no data")
            var textView: TextView = myView.findViewById<TextView>(R.id.textViewFiledName)
            textView.setText(name)
        } else {
            var textView: TextView = myView.findViewById<TextView>(R.id.textViewFiledName)
            textView.setText("There is no data")
        }
        return myView
    }
}