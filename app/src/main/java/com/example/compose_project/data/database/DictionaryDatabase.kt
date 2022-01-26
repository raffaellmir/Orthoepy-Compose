package com.example.compose_project.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Word::class], version = 1, exportSchema = true)
abstract class DictionaryDatabase : RoomDatabase() {

    abstract fun dictionaryDao() : DictionaryDao
}