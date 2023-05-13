package com.example.uklrecycleviewvalorant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridAgentAdapter (private val listAgent: ArrayList<Agent>) : RecyclerView.Adapter<GridAgentAdapter.GridViewHolder>() {
    class GridViewHolder(itemView: View)  : ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }



    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_agent, viewGroup, false)
        return GridViewHolder(view)
    }



    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listAgent[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listAgent[holder.adapterPosition]) }

    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Agent)
    }


    override fun getItemCount(): Int {
        return listAgent.size
    }

}