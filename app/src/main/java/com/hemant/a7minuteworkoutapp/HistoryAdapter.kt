package com.hemant.a7minuteworkoutapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hemant.a7minuteworkoutapp.databinding.ItemHistoryBinding

class HistoryAdapter(private val items: ArrayList<String>) :
    RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    class ViewHolder(binding: ItemHistoryBinding) : RecyclerView.ViewHolder(binding.root) {
        val llHistoryItemMain = binding.llHistoryItemMain
        val tvItem = binding.tvItem
        val tvPosition = binding.tvPosition
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemHistoryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //this function helps us to define how every single item in the recycler view should be handled
        val date: String = items[position]
        holder.tvPosition.text = (position + 1).toString()
        holder.tvItem.text = date

        if ((position) % 2 == 0) {
            holder.llHistoryItemMain.setBackgroundColor(Color.parseColor("#ebebeb"))
        } else {
            holder.llHistoryItemMain.setBackgroundColor(Color.parseColor("#ffffff"))
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}