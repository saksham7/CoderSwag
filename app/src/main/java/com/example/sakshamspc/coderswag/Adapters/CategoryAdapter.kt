package com.example.sakshamspc.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sakshamspc.coderswag.Model.Category
import com.example.sakshamspc.coderswag.R



/**
 * Created by Saksham's PC on 7/20/2018.
 */
class CategoryAdapter(context: Context,categories:List<Category>): BaseAdapter() {
    val context=context
    val categories=categories


    override fun getCount(): Int {
       return  categories.count()
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder:ViewHolder
        //if view is not created yet then if block runs
        if(convertView == null){
            categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder=ViewHolder()
            holder.CategoryImage=categoryView.findViewById(R.id.categoryImage)
            holder.CategoryText=categoryView.findViewById(R.id.nameCategory)
            println("I exist for the first time")
            categoryView.tag=holder
        }else{
            holder=convertView.tag as ViewHolder
            categoryView=convertView
            println("Recycled View is displayed.")
        }


        val category=categories[position]
        //setting image
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.CategoryImage?.setImageResource(resourceId)
        //setting textview

        holder.CategoryText?.text=category.title

        return categoryView
    }

    private class ViewHolder{
        var CategoryImage:ImageView?=null
        var CategoryText:TextView?=null
    }
}