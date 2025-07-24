package com.example.platziapi.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import kotlin.text.Typography.dagger

@InstallIn(SingletonComponent::class)
@Module
class Networkmodule {
@Provides
@Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl()
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }


}