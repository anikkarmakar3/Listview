package com.lock.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Contactadapter(val context:Context,val data:ArrayList<Contactmodel>) : BaseAdapter() {
    lateinit var text1:TextView
    lateinit var text2:TextView
    lateinit var image:ImageView
    override fun getCount(): Int {
      return  data.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView=convertView
        convertView=LayoutInflater.from(context).inflate(R.layout.itemlist,parent,false)
        text1= convertView.findViewById(R.id.contactname)
        text2=convertView.findViewById(R.id.contactno)
        image=convertView.findViewById(R.id.image)
        image.setImageResource(data[position].image)
        text1.text= data[position].name.toString()
        text2.text= data[position].number.toInt().toString()
        return convertView
    }
}