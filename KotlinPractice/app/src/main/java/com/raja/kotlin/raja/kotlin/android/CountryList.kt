package com.raja.kotlin.raja.kotlin.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ryadar.kotlinpractice.R

/**
 * Created by Ryadar on 12/30/18.
 */
class CountryList : AppCompatActivity() {

    var countryList: RecyclerView ? = null

    var arrayList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_country_list)

        addCountried()

        countryList = findViewById(R.id.countryListRecyclerList)

        countryList?.layoutManager = LinearLayoutManager(applicationContext)

        countryList?.adapter =  CountryListAdapter(arrayList)

    }

    fun addCountried(){
        arrayList.add("India")
        arrayList.add("US")
        arrayList.add("Mex")
        arrayList.add("Canada")
        arrayList.add("Netherland")
    }


}