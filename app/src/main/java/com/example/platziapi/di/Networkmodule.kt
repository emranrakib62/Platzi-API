package com.example.platziapi.di

import com.example.platziapi.network.Platziervice
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.Base64
import javax.inject.Singleton
import kotlin.text.Typography.dagger

@InstallIn(SingletonComponent::class)
@Module
class Networkmodule {
@Provides
@Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
@Provides
@Singleton
    fun provideProductService(retrofit: Retrofit):Platziervice{
        return retrofit.create(Platziervice::class.java)
    }



}