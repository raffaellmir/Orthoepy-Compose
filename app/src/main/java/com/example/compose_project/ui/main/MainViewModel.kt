package com.example.compose_project.ui.main

import androidx.lifecycle.*
import com.example.compose_project.data.repository.DatastoreRepository
import com.example.compose_project.data.repository.DictionaryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val datastoreRepository: DatastoreRepository,
    private val dictionaryRepository: DictionaryRepository,
    ) : ViewModel() {

    fun increaseLetterCount(letters: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            datastoreRepository.increaseLetterCount(letters)
        }

    }

    val getLetterCount = datastoreRepository.getLetterCountFlow.asLiveData()

    val getAllWords = dictionaryRepository.readAll.asLiveData()
}

