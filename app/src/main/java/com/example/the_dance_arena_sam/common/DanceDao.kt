package com.example.the_dance_arena_sam.common

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

//import java.util.concurrent.Flow

@Dao
interface DanceDao {
    @Query("select * from setData")
    fun readDanceData(): Flow<List<DanceData>>

    @Insert
    suspend fun writeDanceData(danceSY:DanceData)

}