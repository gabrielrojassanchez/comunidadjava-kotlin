package com.example.comunidad_java

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlin.properties.Delegates

class ListAdapter(val listener: (ListItem) -> Unit) : RecyclerView.Adapter<ListHolder>() {

    var items: List<ListItem> by Delegates.observable(emptyList()) {p, old, new ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        return ListHolder(LayoutInflater.from(parent.context).inflate(R.layout.h_list, parent, false))
    }

    override fun getItemCount(): Int {
        return  items.size
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener{listener(items[position])}
    }
}