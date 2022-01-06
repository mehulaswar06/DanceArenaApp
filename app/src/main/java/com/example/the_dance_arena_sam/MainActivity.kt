package com.example.the_dance_arena_sam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_recycler.adapter=Adapter(setData.SetDance())
        my_recycler.layoutManager=LinearLayoutManager(this)
    }
}