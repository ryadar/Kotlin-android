package com.raja.kotlin.raja.kotlin.android

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.ryadar.kotlinpractice.R

/**
 * Created by Ryadar on 12/30/18.
 */
class CountryListHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    var  countryName  :TextView ? = itemView?.findViewById(R.id.countryName)

}