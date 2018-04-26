package com.raja.kotlin.raja.kotlin.android

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ryadar.kotlinpractice.R


class RecyclerViewExample : AppCompatActivity() {
    var recyclerView: RecyclerView? = null;
    var list = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list.add("Raja")
        list.add("Shekar")
        setContentView(R.layout.recycler_view_layout)
        recyclerView = findViewById(R.id.recycler_view);

        var myAdapter = MyRecyclerViewAdapter(list)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = myAdapter;
    }
}