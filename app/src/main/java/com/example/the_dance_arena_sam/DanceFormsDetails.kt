package com.example.the_dance_arena_sam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.planeto.danceData
import kotlinx.android.synthetic.main.activity_dance_forms_details.*

class DanceFormsDetails : AppCompatActivity() {
    private lateinit var obj:danceData
    private  var danceImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dance_forms_details)
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR or View.SYSTEM_UI_FLAG_FULLSCREEN }

        obj= intent.getParcelableExtra("dance")!!
        danceImg=intent.getIntExtra("danceImage",-1)
        setData(obj, danceImg!!)


    }
    private fun setData(obj: danceData, danceImg:Int)
    {
        title_details.text=obj.title
        origin_details.text=obj.origin
        exponent_details.text=obj.exponent
        overview_details.text=obj.overview
        dance_form_details.setImageResource(danceImg)


    }
}