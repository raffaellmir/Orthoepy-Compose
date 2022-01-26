package com.example.compose_project.data.repository

import com.example.compose_project.data.database.DictionaryDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DictionaryRepository @Inject constructor(
    private val dictionaryDao: DictionaryDao,
) {
    val readAll = dictionaryDao.readAll()

}