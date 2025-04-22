package com.example.lab9.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object MarsApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
