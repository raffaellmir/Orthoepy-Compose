package com.example.compose_project.di

import android.content.Context
import androidx.room.Room
import com.example.compose_project.data.database.DictionaryDatabase
import com.example.compose_project.data.repository.DatastoreRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideDatastoreRepository(@ApplicationContext context: Context) : DatastoreRepository {
        return DatastoreRepository(context = context)
    }

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context ) = Room.databaseBuilder(
        context,
        DictionaryDatabase::class.java,
        "dictionary"
    ).createFromAsset("database/dictionary.db").build()

    @Singleton
    @Provides
    fun provideDao(database: DictionaryDatabase) = database.dictionaryDao()
}