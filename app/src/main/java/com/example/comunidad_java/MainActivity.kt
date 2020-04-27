package com.example.comunidad_java

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_items.setHasFixedSize(true)
        rv_items.layoutManager = GridLayoutManager(this, 2)

        val mAdapter =ListAdapter {
                listItem ->  toast(listItem.message)
        }

        rv_items.adapter = mAdapter
        mAdapter.items = mediaItems
    }

    val mediaItems = (1..10).map {
        ListItem(
            id = it,
            message = "Android item no $it",
            url = URL_IMAGE
        )}

    fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
