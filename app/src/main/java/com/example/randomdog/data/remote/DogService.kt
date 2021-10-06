package com.example.randomdog.data.remote

import com.example.randomdog.model.DogResponse
import com.example.randomdog.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface DogService {
    @GET(Constants.RANDOM_URL)
    suspend fun getDog(): Response<DogResponse>
}