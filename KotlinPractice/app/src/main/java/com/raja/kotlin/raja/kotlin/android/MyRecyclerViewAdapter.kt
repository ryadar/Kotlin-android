package com.raja.kotlin.raja.kotlin.android

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ryadar.kotlinpractice.R

class MyRecyclerViewAdapter() : RecyclerView.Adapter<MyHolder>() {
    private var myList: ArrayList<String>? = ArrayList<String>()

    public constructor(list: ArrayList<String>?) : this() {
        myList = list

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false))
    }

    override fun getItemCount(): Int = 2

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.name.setText(myList?.get(position))
    }

}