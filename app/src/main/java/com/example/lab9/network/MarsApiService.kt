package com.example.lab9.network

import com.example.lab9.model.MarsPhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MarsApiService {
    @GET("mars-photos/api/v1/rovers/curiosity/photos")
    suspend fun getMarsPhotos(
        @Query("sol") sol: Int = 1000,
        @Query("api_key") apiKey: String = "DEMO_KEY"
    ): MarsPhotoResponse
}
