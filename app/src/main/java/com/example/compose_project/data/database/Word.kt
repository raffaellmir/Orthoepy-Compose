package com.example.compose_project.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dictionary")
class Word (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val wordText: String,
    val wordTextStress: String,
    val stressIndex: Int,
    val memorizationLevel: Int,
    val isBought: String,
)