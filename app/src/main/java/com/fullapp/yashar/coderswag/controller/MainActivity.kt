package com.fullapp.yashar.coderswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import com.fullapp.yashar.coderswag.Adapters.CategoryAdapter
import com.fullapp.yashar.coderswag.Adapters.CatgoryRecyclerAdapter
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.Utilities.EXTERCATGPRY
import com.fullapp.yashar.coderswag.model.Category
import com.fullapp.yashar.coderswag.services.Dataservice
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    lateinit var  adapter : CategoryAdapter
      lateinit var  adapter : CatgoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        adapter = CategoryAdapter(this,Dataservice.category)
//        catelist.adapter =adapter
//        catelist.setOnItemClickListener { adapterView, view, i, l ->
//            val catgory =Dataservice.category[i]
//            Toast.makeText(this ,"شما بر روی ${catgory.title} کلیک کزده اید",Toast.LENGTH_LONG).show()
//        }

        adapter = CatgoryRecyclerAdapter(this ,Dataservice.category){category ->
           val gotoproduct = Intent(this,ProductActivty::class.java)
            gotoproduct.putExtra(EXTERCATGPRY,category.title)
            startActivity(gotoproduct)

        }
        catelist.adapter =adapter
        val layoutmanager =LinearLayoutManager(this)
        catelist.layoutManager=layoutmanager
        catelist.setHasFixedSize(true)

    }
}
