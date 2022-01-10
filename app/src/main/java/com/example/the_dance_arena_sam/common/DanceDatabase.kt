package com.example.the_dance_arena_sam.common

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DanceData::class], version = 1, exportSchema = false)
abstract class DanceDatabase : RoomDatabase() {

    abstract fun itemDao(): DanceDao

    companion object {
        @Volatile
        private var INSTANCE: DanceDatabase? = null
        fun getDatabase(context: Context): DanceDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DanceDatabase::class.java,
                    "setData"
                )
                    .createFromAsset("setData.db")
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}