package com.example.sakshamspc.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.sakshamspc.coderswag.Adapters.CategoryAdapter
import com.example.sakshamspc.coderswag.Model.Category
import com.example.sakshamspc.coderswag.R
import com.example.sakshamspc.coderswag.Services.DataService
import com.example.sakshamspc.coderswag.Services.DataService.categories
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     adapter=CategoryAdapter(this,DataService.categories)
//        adapter= ArrayAdapter(this,
//                android.R.layout.simple_list_item_1,
//                DataService.categories)
        categoryListView.adapter=adapter
    }
}
