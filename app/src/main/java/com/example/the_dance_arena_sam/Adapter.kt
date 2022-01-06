package com.example.the_dance_arena_sam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var dance:List<danceData>): RecyclerView.Adapter<myViewHolder>() {
    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
         var itemView=LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
         return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return dance.size
    }
}
