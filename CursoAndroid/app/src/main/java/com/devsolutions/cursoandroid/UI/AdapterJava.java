package com.devsolutions.cursoandroid.UI;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.devsolutions.cursoandroid.Datos.Modelo.PostModel;
import com.devsolutions.cursoandroid.R;
import com.devsolutions.cursoandroid.databinding.ItemListPostBinding;

import java.util.ArrayList;

public class AdapterJava extends RecyclerView.Adapter<AdapterJava.ViewHolder> {
    private ArrayList<PostModel> lista;
    public AdapterJava(ArrayList<PostModel> l){
        this.lista = l;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ItemListPostBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             binding= ItemListPostBinding.bind(itemView);

        }
    }

    @NonNull
    @Override
    public AdapterJava.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_list_post, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterJava.ViewHolder holder, int position) {
        PostModel currentItem = lista.get(position);
        holder.binding.tvBody.setText(currentItem.getBody());
        holder.binding.tvTitulo.setText(currentItem.getTitulo());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
