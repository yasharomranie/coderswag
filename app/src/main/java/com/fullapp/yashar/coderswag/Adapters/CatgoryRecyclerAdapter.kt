package com.fullapp.yashar.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.model.Category
import kotlinx.android.synthetic.main.catgory_list_item.view.*

class CatgoryRecyclerAdapter(val context:Context,val catgories : List<Category>,val itemClick :(Category)->Unit) : RecyclerView.Adapter<CatgoryRecyclerAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
  val veiw = LayoutInflater.from(context)
          .inflate(R.layout.catgory_list_item,parent,false)

        return Holder(veiw ,itemClick)
    }

    override fun getItemCount(): Int {
       return catgories.count()
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindcategory(catgories[position],context)
    }


    inner  class Holder(itemView: View? ,val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
      val categorimage = itemView?.findViewById<ImageView>(R.id.categoryimage)
      val categorname =itemView?.findViewById<TextView>(R.id.categoryname)

        fun bindcategory(catgory :Category,context:Context){
            val resourceid= context.resources.getIdentifier(catgory.image,"drawable",context.packageName)
            categorimage?.setImageResource(resourceid)
            categorname?.text=catgory.title
            itemView.setOnClickListener {itemClick(catgory)}

        }
    }
}