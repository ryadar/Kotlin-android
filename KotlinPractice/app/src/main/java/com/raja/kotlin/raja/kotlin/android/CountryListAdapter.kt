package com.raja.kotlin.raja.kotlin.android

import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ryadar.kotlinpractice.R

/**
 * Created by Ryadar on 12/30/18.
 */
class CountryListAdapter(var arrayList:ArrayList<String>) : Adapter<CountryListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryListHolder {

        return CountryListHolder(LayoutInflater.from(parent.context).inflate(R.layout.country_list_item, parent, false))

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: CountryListHolder, position: Int) {
                 holder.countryName?.text= arrayList.get(position)
    }


}