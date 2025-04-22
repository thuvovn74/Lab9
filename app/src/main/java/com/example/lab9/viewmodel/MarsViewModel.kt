package com.example.lab9.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lab9.model.MarsPhoto
import com.example.lab9.network.MarsApi
import kotlinx.coroutines.launch

class MarsViewModel : ViewModel() {
    var marsPhotos by mutableStateOf<List<MarsPhoto>>(emptyList())
        private set

    init {
        viewModelScope.launch {
            try {
                val response = MarsApi.retrofitService.getMarsPhotos()
                marsPhotos = response.photos
            } catch (e: Exception) {
                Log.e("MarsViewModel", "Error: ${e.message}")
            }
        }
    }
}
