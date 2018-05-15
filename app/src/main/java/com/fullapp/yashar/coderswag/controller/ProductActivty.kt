package com.fullapp.yashar.coderswag.controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Adapter
import android.widget.GridLayout
import com.fullapp.yashar.coderswag.Adapters.ProductAdapter
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.Utilities.EXTERCATGPRY
import com.fullapp.yashar.coderswag.services.Dataservice
import kotlinx.android.synthetic.main.activity_product_activty.*

class ProductActivty : AppCompatActivity() {
lateinit var Adapter :ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_activty)
      val catgorytype= intent.getStringExtra(EXTERCATGPRY)
        pcatgorytitle.text=catgorytype
        Adapter= ProductAdapter(this, Dataservice.getProducts(catgorytype))
        var spancount =2
        val orientation=resources.configuration.orientation
        if (orientation==Configuration.ORIENTATION_LANDSCAPE){
            spancount=3
        }
        val screensize=resources.configuration.screenWidthDp
        if (screensize>720){
            spancount=3
        }


        val layoutManager = GridLayoutManager(this , spancount)
        productlist.layoutManager=layoutManager
        productlist.adapter=Adapter
    }
}
