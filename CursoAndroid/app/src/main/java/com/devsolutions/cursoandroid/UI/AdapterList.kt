package com.devsolutions.cursoandroid.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devsolutions.cursoandroid.Datos.Modelo.PostModel
import com.devsolutions.cursoandroid.R
import com.devsolutions.cursoandroid.databinding.ItemListPostBinding

class AdapterList(val list:ArrayList<PostModel>):
    RecyclerView.Adapter<AdapterList.ViewHolder>() {

    inner class ViewHolder(v: View) :RecyclerView.ViewHolder(v){
        val binding = ItemListPostBinding.bind(v)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            AdapterList.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.item_list_post, parent, false))

    }
    override fun onBindViewHolder(holder: AdapterList.ViewHolder, position: Int) {
        holder.binding.apply {
            val currentItem = list[position]
            tvBody.text = currentItem.body
            tvTitulo.text = currentItem.titulo
        }
    }
    override fun getItemCount(): Int {
        return list.size
    }

}






