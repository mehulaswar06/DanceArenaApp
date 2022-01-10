package com.example.the_dance_arena_sam

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.the_dance_arena_sam.common.DanceDao

class DanceViewModel(private val danceDao:DanceDao): ViewModel() {
    fun getDanceData()=danceDao.readDanceData()
//    suspend fun writeDanceData(danceSY: DanceData)=danceDao.writeDanceData(danceSY)
//    init  {
//        viewModelScope.launch { writeDanceData(DanceData(id=15,title="Mehul",origin="Akola",exponent="As",overview = "aiuhfiu")) }
    }



class DanceViewModelFactory(private val danceDao: DanceDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DanceViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DanceViewModel(danceDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}