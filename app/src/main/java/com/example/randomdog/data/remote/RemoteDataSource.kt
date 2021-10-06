package com.example.randomdog.data.remote

import com.example.randomdog.data.remote.DogService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val dogService: DogService) {
    suspend fun getDog() =
        dogService.getDog()
}