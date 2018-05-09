package com.fullapp.yashar.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.model.Category
import com.fullapp.yashar.coderswag.services.Dataservice
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter : ArrayAdapter<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,Dataservice.category)
        catelist.adapter =adapter
    }
}
