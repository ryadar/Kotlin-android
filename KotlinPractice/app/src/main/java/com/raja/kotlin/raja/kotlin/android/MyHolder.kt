package com.raja.kotlin.raja.kotlin.android

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.ryadar.kotlinpractice.R

class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var myItem:View
    init {
        myItem=itemView
    }
    var name:TextView =myItem.findViewById(R.id.name);



}