package com.example.the_dance_arena_sam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.the_dance_arena_sam.common.DanceData
import com.example.the_dance_arena_sam.databinding.FragmentWatchBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentWatch.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentWatch : Fragment() {
    private lateinit var _binding: FragmentWatchBinding
    private var posterForm:DanceData?=null
    private var postering:Int=0
    var posterima:Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        _binding= FragmentWatchBinding.inflate(inflater, container, false)
        val view = _binding.root
        val let = arguments?.let {
            postering=it.getInt("postergraphics")
            posterForm=it.getParcelable("posterdetails")
            posterima=it.getInt("posterimages")
            getImage(posterForm,postering)
        }
        return view
    }
    fun getImage(obj:DanceData?,dancePoster:Int){
        _binding.posterImages.setImageResource(dancePoster)
//        _binding.textInPoster.text=obj?.title
    }


}