package com.example.the_dance_arena_sam

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var dance:List<danceData>): RecyclerView.Adapter<Adapter.myViewHolder>() {
    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var danceimg=view.dance_img
        var origin=view.origin
        var exponent=view.exponent



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
         var itemView=LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
         return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage:Int?=null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,DanceFormsDetails::class.java)
            intent.putExtra("planet",dance[position])
            intent.putExtra("planetImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        holder.title.text=dance[position].title
        holder.origin.text=dance[position].origin
        holder.exponent.text=dance[position].exponent

        when(dance[position].title!!.lowercase())
        {
            "kuchipudi"->{
                dummyImage=R.drawable.kuchipudi_dance
            }
            "bharatnatyam"->{
                dummyImage=R.drawable.bharatnatyam_dance
            }
            "kathakali"->{
                dummyImage=R.drawable.kathakali_dance
            }
            "katthak"->{
                dummyImage=R.drawable.katthak_dance
            }
            "manipuri"->{
                dummyImage=R.drawable.manipuri_dance
            }
            "mohiniyattam"->{
                dummyImage=R.drawable.mohiniyattam_dance
            }
            "odissi"->{
                dummyImage=R.drawable.odissi_dance
            }
            "sattriya"->{
                dummyImage=R.drawable.sattriya_dance
            }
        }
        if (dummyImage != null) {
            holder.danceimg.setImageResource(dummyImage)
        }


    }

    override fun getItemCount(): Int {
        return dance.size
    }
}
