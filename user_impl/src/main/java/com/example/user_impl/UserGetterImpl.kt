package com.example.user_impl

import com.example.user_public.User
import com.example.user_public.UserGetter
import javax.inject.Inject

class UserGetterImpl @Inject constructor(): UserGetter {
    override fun getUser(): User {
        return User(3)
    }
}