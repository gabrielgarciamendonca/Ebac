package com.asgard.recycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asgard.recycle.databinding.PlaceBinding

class ListAdapter(
    val listItems: MutableList<ListItem>,
    val listener: IListAdapterListener
    ): RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(PlaceBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val item = listItems[position]
        holder.posicao.text = position.toString()
        holder.conteudo.text = item.city

        holder.root.setOnClickListener {
            listener.onItemClicked(item.city)
        }
    }

    class ListItemViewHolder(binding: PlaceBinding): RecyclerView.ViewHolder(binding.root) {
        var root = binding.root
        var posicao = binding.posicao
        var conteudo = binding.conteudo
    }

    interface IListAdapterListener {
        fun onItemClicked(value: String)
    }
}