package com.example.motionlayoutexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutexample.databinding.ItemListBinding

class Adapter: RecyclerView.Adapter<Adapter.ListViewHolder>() {
    private val list = ArrayList<String>()

    fun setData(list: List<String>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    class ListViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String){
            with(binding){
                itemText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) = holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}