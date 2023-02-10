package com.example.user_wiring

import com.example.user_impl.UserGetterImpl
import com.example.user_public.UserGetter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface UserWiring {

    @Binds
    fun bindsUserGetter(userGetter: UserGetterImpl): UserGetter
}