package com.example.compose_project.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DatastoreRepository @Inject constructor(@ApplicationContext private val context: Context) {

    private val Context.datastore : DataStore<Preferences> by preferencesDataStore(name = "LetterCount")

    companion object {
        val letterCounter = intPreferencesKey("LETTER_COUNTER")
    }

    suspend fun increaseLetterCount (letters: Int) {
        context.datastore.edit { counter ->
            val currentCounterValue = counter[letterCounter] ?: 2
            counter[letterCounter] = currentCounterValue + letters
        }
    }

    val letterCountFlow: Flow<Int> = context.datastore.data
        .map { preferences ->
            preferences[letterCounter] ?: 2
        }
}