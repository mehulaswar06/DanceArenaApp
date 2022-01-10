package com.example.planeto


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.the_dance_arena_sam.R
import com.example.the_dance_arena_sam.common.DanceData
import com.example.the_dance_arena_sam.fragment_mainDirections
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var dance: List<DanceData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var danceimg = view.dance_img
        var origin = view.origin
        var exponent = view.exponent


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        var dummyPoster: Int?=null

        holder.title.text = dance[position].title
        holder.origin.text = dance[position].origin
        holder.exponent.text = dance[position].exponent



        when (dance[position].title!!.lowercase()) {
            "kuchipudi" -> {
                dummyImage = R.drawable.kuchipudi_dance
            }
            "bharatnatyam" -> {
                dummyImage = R.drawable.bharatnatyam_dance
            }
            "kathakali" -> {
                dummyImage = R.drawable.kathakali_dance
            }
            "kathak" -> {
                dummyImage = R.drawable.katthak_dance
            }
            "manipuri" -> {
                dummyImage = R.drawable.manipuri_dance
            }
            "mohiniyattam" -> {
                dummyImage = R.drawable.mohiniyattam_dance
            }
            "odissi" -> {
                dummyImage = R.drawable.odissi_dance
            }
            "sattriya" -> {
                dummyImage = R.drawable.sattriya_dance
            }
            else -> {
                dummyImage = R.drawable.bharatnatyam_dance

            }


        }



        holder.danceimg.setImageResource(dummyImage!!)
        holder.itemView.setOnClickListener {
            val action = fragment_mainDirections.actionFragmentMainToFragmentDanceForms(
                dancedetails = dance[position],
                danceimages = dummyImage!!,
                posterimages = dummyPoster!!
            )
            holder.itemView.findNavController().navigate(action)


        }
        when (dance[position].title!!.lowercase()) {
            "kuchipudi" -> {
                dummyPoster = R.drawable.kuchipudi_poster
            }
            "bharatnatyam" -> {
                dummyPoster = R.drawable.bharatnatyam_poster
            }
            "kathakali" -> {
                dummyPoster = R.drawable.kathakali_poster
            }
            "kathak" -> {
                dummyPoster = R.drawable.kathak_poster
            }
            "manipuri" -> {
                dummyPoster = R.drawable.manipuri_poster
            }
            "mohiniyattam" -> {
                dummyPoster = R.drawable.mohiniyattam_poster
            }
            "odissi" -> {
                dummyPoster = R.drawable.odissi_poster
            }
            "sattriya" -> {
                dummyPoster = R.drawable.sattriya_poster
            }
            else -> {
                dummyPoster = R.drawable.sattriya_poster

            }

        }
        holder.danceimg.setImageResource(dummyImage!!)
        holder.itemView.setOnClickListener {
            val action = fragment_mainDirections.actionFragmentMainToFragmentDanceForms(
                dancedetails = dance[position],
                danceimages = dummyImage!!,
                posterimages = dummyPoster!!
            )
            holder.itemView.findNavController().navigate(action)

        }
    }



        override fun getItemCount(): Int {
            return dance.size
        }
    }
