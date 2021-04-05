package com.mvvm.data.model

import java.io.Serializable

data class User(
    val id: String,
    val createdAt: String,
    val name: String,
    val avatar: String,
    val email: String
):Serializable