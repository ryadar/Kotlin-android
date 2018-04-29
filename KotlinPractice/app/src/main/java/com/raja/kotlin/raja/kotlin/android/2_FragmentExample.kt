package com.raja.kotlin.raja.kotlin.android

import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.ryadar.kotlinpractice.R

class FragmentExample :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

        var bundle =Bundle()

        bundle.putString("MyKey","Passing data from activity")

        var fragmentManager: FragmentManager = supportFragmentManager
        var fragmentTransaction : FragmentTransaction =fragmentManager.beginTransaction()
        var fragment =MyFragment()
        fragment.arguments=bundle
        fragmentTransaction.add(R.id.parentLayout,fragment)
        fragmentTransaction.commit()
    }
}
