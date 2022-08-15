package com.hans.mmu.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Created by Gastón Saillén on 07 July 2020
 */
@Database(entities = [],version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
   // abstract fun cocktailDao(): CocktailDao
}