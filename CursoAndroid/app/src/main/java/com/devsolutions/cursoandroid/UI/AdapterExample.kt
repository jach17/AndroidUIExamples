package com.devsolutions.cursoandroid.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.devsolutions.cursoandroid.Datos.Modelo.PostModel
import com.devsolutions.cursoandroid.R
import com.devsolutions.cursoandroid.databinding.ItemListPostBinding

class AdapterExample(val list: ArrayList<PostModel>) :
    RecyclerView.Adapter<AdapterExample.ViewHolder>() {
    inner class ViewHolder(v: View)
        : RecyclerView.ViewHolder(v) {
        val binding = ItemListPostBinding.bind(v)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).
            inflate
                (R.layout.item_list_post, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            val item = list[position]
            tvBody.text = item.body
            tvTitulo.text = item.titulo

        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}