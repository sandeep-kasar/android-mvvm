package com.mvvm.data.api

import com.mvvm.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun  getUsers(): List<User>

}