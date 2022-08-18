package com.example.testapp

import retrofit2.Response
import retrofit2.http.GET

interface ImagesApi {
    @GET("media")
    suspend fun getImages(): Response<ImagesResponse>

}