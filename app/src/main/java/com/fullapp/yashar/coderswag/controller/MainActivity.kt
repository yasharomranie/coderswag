package com.fullapp.yashar.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.fullapp.yashar.coderswag.Adapters.CategoryAdapter
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.model.Category
import com.fullapp.yashar.coderswag.services.Dataservice
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  adapter : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,Dataservice.category)
        catelist.adapter =adapter
    }
}
