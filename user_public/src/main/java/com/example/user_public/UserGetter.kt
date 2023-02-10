package com.example.user_public

interface UserGetter {
    fun getUser(): User
}

data class User(
    val id: Int
)