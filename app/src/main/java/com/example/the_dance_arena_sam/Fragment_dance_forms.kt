package com.example.the_dance_arena_sam

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.the_dance_arena_sam.common.DanceData
import com.example.the_dance_arena_sam.databinding.FragmentDanceFormsBinding
import kotlinx.android.synthetic.main.fragment_dance_forms.*
import kotlinx.android.synthetic.main.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [Fragment_dance_forms.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_dance_forms : Fragment() {
    private lateinit var _binding: FragmentDanceFormsBinding
    private var danceForm: DanceData? = null
    private var danceima: Int = 0
    private var posterima: Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDanceFormsBinding.inflate(inflater, container, false)
        val view = _binding.root
        arguments?.let {
            danceForm = it.getParcelable("dancedetails")
            danceima = it.getInt("danceimages")
            posterima = it.getInt("posterimages")
            Log.i("ahe", danceForm.toString())
            setData(danceForm, danceima)

        }
        _binding.buttonInfo.setOnClickListener {
            val actiona =Fragment_dance_formsDirections.actionFragmentDanceFormsToFragmentWatch(postergraphics = posterima,posterdetails = danceForm!!,posterimages = danceima)
            _binding.buttonInfo.findNavController().navigate(actiona)

        }

        return view
    }


    fun setData(obj: DanceData?, danceImg: Int) {

        _binding.titleDetails.text = obj?.title
        _binding.originDetails.text = obj?.origin
        _binding.exponentDetails.text = obj?.exponent
        _binding.overviewDetails.text = obj?.overview
        _binding.danceFormDetails.setImageResource(danceImg)
    }


}

