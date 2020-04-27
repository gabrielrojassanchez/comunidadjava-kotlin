package com.example.comunidad_java

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.h_list.view.*


class ListHolder(view: View)  : RecyclerView.ViewHolder(view){
    fun bind(item : ListItem) {
        itemView.tv_list.text = item.message

        Picasso.get()
            .load(item.url)
            .fit()
            .centerInside()
            .placeholder(R.mipmap.ic_launcher)
            .into(itemView.iv_pic)

    }
}