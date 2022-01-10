package com.example.the_dance_arena_sam

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.planeto.Adapter
import com.example.the_dance_arena_sam.common.DanceDatabase
import com.example.the_dance_arena_sam.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragment_main.newInstance] factory method to
 * create an instance of this fragment.
 */

class fragment_main : Fragment() {
    private lateinit var _binding: FragmentMainBinding
    private lateinit var my_recycler: RecyclerView

    // Keeps track of which LayoutManager is in use for the [RecyclerView]

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val application = requireNotNull(this.activity).application


        val dataSource = DanceDatabase.getDatabase(application).itemDao()
        val viewModelFactory = DanceViewModelFactory( dataSource)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(DanceViewModel::class.java)
        _binding=FragmentMainBinding.inflate(inflater, container, false)
        val view = _binding.root
        my_recycler=_binding.myRecycler




        lifecycleScope.launch {
            viewModel.getDanceData().collect {
                my_recycler.adapter = Adapter(it)
            }
        }

        my_recycler.layoutManager = LinearLayoutManager(context)

        return view
    }


}