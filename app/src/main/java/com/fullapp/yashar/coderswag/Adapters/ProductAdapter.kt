package com.fullapp.yashar.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.fullapp.yashar.coderswag.R
import com.fullapp.yashar.coderswag.model.Product
import java.util.zip.Inflater

class ProductAdapter(val context:Context,val product:List<Product>) :RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
       val veiw =LayoutInflater.from(context).inflate(R.layout.product_list_item,parent,false)
        return ProductHolder(veiw)
    }

    override fun getItemCount(): Int {
        return product.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindproduct(product[position],context)
    }

    inner class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
        val productimage = itemView?.findViewById<ImageView>(R.id.productimage)
        val productname =itemView?.findViewById<TextView>(R.id.productname)
        val prodctprice =itemView?.findViewById<TextView>(R.id.productprice)

        fun bindproduct(product:Product,context: Context){
            val resourceid = context.resources.getIdentifier(product.iamge,"drawable",context.packageName)
            productimage?.setImageResource(resourceid)
            productname?.text=product.title
            prodctprice?.text=product.price

        }

    }
}