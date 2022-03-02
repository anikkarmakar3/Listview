package com.lock.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ListView
import com.lock.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var binding:ActivityMainBinding
        val showitem:ArrayList<Contactmodel> = ArrayList()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(LayoutInflater.from(this))
        var view=binding.root
        setContentView(view)
        val itemimage=R.drawable.ic_launcher_foreground.toInt()
        showitem.add(Contactmodel(itemimage,"sonai",50000))
        /*showitem.add(Contactmodel("Anik",200000))
        showitem.add(Contactmodel("Ayanava",200520000))
        showitem.add(Contactmodel("sdsdsk",52640))
        showitem.add(Contactmodel("fdfik",2025800))
        showitem.add(Contactmodel("dshjnhg",242000))*/
        var adapter=Contactadapter(this,showitem)

        binding.list.adapter=adapter
    }

}