package com.ryadar.kotlinpractice;

import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class MyHolder extends RecyclerView.ViewHolder {
     MyView imageView;
    public MyHolder(View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageView);

    }
}
