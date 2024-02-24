package com.example.recylerviewwithclickfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), OnItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recycleritem_view)


        val dataItem = ArrayList<ItemModel>()
        dataItem.add(ItemModel("John", "1990", "Athens "))
        dataItem.add(ItemModel("Alex", "1991", "Athens "))
        dataItem.add(ItemModel("Robin", "1992", "Athens "))
        dataItem.add(ItemModel("Sam", "1993", "Athens "))
        dataItem.add(ItemModel("Halen", "1994", "Athens "))
        dataItem.add(ItemModel("Hilda", "1995", "Athens "))
        dataItem.add(ItemModel("Nikolas", "1996", "Athens "))
        dataItem.add(ItemModel("Athena", "1996", "Athens "))
        dataItem.add(ItemModel("Nice", "1995", "Athens "))
        dataItem.add(ItemModel("Chou", "1996", "Athens "))
        dataItem.add(ItemModel("Athena", "1996", "Athens "))

        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = RecylerViewItemAdapter( dataItem, this)
        recyclerview.adapter = adapter

    }

    override fun onItemClick(itemModel: ItemModel) {
        Toast.makeText(this, itemModel.userName, Toast.LENGTH_LONG).show()
    }

}