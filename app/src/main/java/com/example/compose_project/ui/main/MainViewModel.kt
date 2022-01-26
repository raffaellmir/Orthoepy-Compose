package com.example.compose_project.ui.main

import androidx.lifecycle.*
import com.example.compose_project.repository.DatastoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val datastoreRepository: DatastoreRepository
    ) : ViewModel() {

    fun increaseLetterCount(letters: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            datastoreRepository.increaseLetterCount(letters)
        }

    }

    val getLetterCount = datastoreRepository.getLetterCountFlow.asLiveData()
}

