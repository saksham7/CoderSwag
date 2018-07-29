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
        categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
        val categoryImage:ImageView=categoryView.findViewById(R.id.categoryImage)
        val categoryText:TextView=categoryView.findViewById(R.id.nameCategory)

        val category=categories[position]
        //setting image
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryImage.setImageResource(resourceId)
        //setting textview

        categoryText.text=category.title

        return categoryView
    }
}