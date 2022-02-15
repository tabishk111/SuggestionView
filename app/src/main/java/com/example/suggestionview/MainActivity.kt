package com.example.suggestionview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: Adapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemList: List<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()

        addItems()

        adapter.differ.submitList(itemList)

    }

    private fun addItems() {
        itemList = listOf(
            Category(1,"List Item 1"),
        Category(2,"List Item 2"),
            Category(3,"List Item 3"),
        Category(4,"List Item 4"),
        Category(5,"List Item 5"),
        Category(6,"List Item 6"),
        Category(7,"List Item 7"),
        Category(8,"List Item 8"),
        Category(9,"List Item 9"),
        Category(10,"List Item 10"),
        Category(11,"List Item 11"),
        Category(12,"List Item 12"),
        Category(13,"List Item 13")
        )
    }

    private fun setUpRecyclerView() {
        adapter = Adapter()
        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this,3, GridLayoutManager.HORIZONTAL,false)
    }


}