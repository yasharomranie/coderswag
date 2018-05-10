package com.fullapp.yashar.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.model.Category
import java.text.ParsePosition

class CategoryAdapter(context : Context, categories:List<Category>) :BaseAdapter() {
    val context =context
    val categories=categories

    override fun getView(position: Int, convertView:View?, parent: ViewGroup?): View {
   val catgoryView:View
        val holder:ViewHolder
        if (convertView == null){
            catgoryView=LayoutInflater.from(context).inflate(R.layout.catgory_list_item,null)
            holder =ViewHolder()
       holder.categoryimage= catgoryView.findViewById(R.id.categoryimage)
        holder.catgoryname=catgoryView.findViewById(R.id.categoryname)
            println("برای اولین بار اجرا می شوم")
            catgoryView.tag = holder
        }else{
            holder =convertView.tag as ViewHolder
            catgoryView = convertView
            println("ریسایکل سبز خخخخ")
        }


         val category =categories[position]
         val resourceid = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryimage?.setImageResource(resourceid)


         holder.catgoryname?.text = category.title

        return catgoryView
    }

    override fun getItem(position: Int): Any {
      return  categories[position]
    }

    override fun getItemId(position: Int): Long {
       return  0
    }

    override fun getCount(): Int {
        return  categories.count()
    }

    private class ViewHolder{
       var  categoryimage :ImageView?=null
       var catgoryname :TextView?=null

    }
}