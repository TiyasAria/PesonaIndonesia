package com.idn.smart.tiyas.pesonaindonesia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_pesona_indonesia.view.*

class ListPesonaAdapter(private val listPesonaIndonesia: ArrayList<PesonaIndonesia>) : RecyclerView.Adapter<ListPesonaAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(pesonaIndonesia: PesonaIndonesia){
            with(itemView){
                //menampilkan gambar
                Glide.with(itemView.context).load(pesonaIndonesia.photo).apply(RequestOptions()).into(iv_list_photo)
                //menapilkan nama dan description
                tv_nama_list.text = pesonaIndonesia.name
                tv_description_list.text = pesonaIndonesia.description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
      val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_pesona_indonesia,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
       holder.bind(listPesonaIndonesia[position])
    }

    override fun getItemCount(): Int = listPesonaIndonesia.size
}