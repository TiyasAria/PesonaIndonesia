package com.idn.smart.tiyas.pesonaindonesia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<PesonaIndonesia>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.addAll(getDataPesonaIndonesia())
        rv_main.setHasFixedSize(true)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_main.layoutManager = LinearLayoutManager(this)
        val listPesonaAdapter = ListPesonaAdapter(list)
        rv_main.adapter = listPesonaAdapter
    }
     private fun getDataPesonaIndonesia():ArrayList<PesonaIndonesia>{
         val dataNama = resources.getStringArray(R.array.data_name)
         val dataDescription = resources.getStringArray(R.array.data_description)
         val dataPhoto = resources.getStringArray(R.array.data_photo)
         val listPesonaIndonesia = ArrayList<PesonaIndonesia>()
         for (position in dataNama.indices){
             val pesonaIndonesia = PesonaIndonesia(
                 dataNama[position],
                 dataDescription[position],
                 dataPhoto[position]
             )
             listPesonaIndonesia.add(pesonaIndonesia)
         }
         return listPesonaIndonesia
     }
}