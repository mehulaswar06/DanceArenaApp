package com.example.the_dance_arena_sam

import android.app.Application
import com.example.the_dance_arena_sam.common.DanceDatabase

class DanceApplication : Application() {
    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts
    val database: DanceDatabase by lazy { DanceDatabase.getDatabase(this) }
}