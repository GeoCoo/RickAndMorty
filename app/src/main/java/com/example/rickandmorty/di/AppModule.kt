package com.example.rickandmorty.di

import android.app.Application
import com.example.rickandmorty.service.CharacterRemoteDataSource
import com.example.rickandmorty.service.CharacterService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(Application::class)
object AppModule {
    private const val baseUrl = "https://rickandmortyapi.com/api"

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson):Retrofit =  Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    @Provides
    fun provideGson():Gson = GsonBuilder().create()

    @Provides
    fun provideCharacterService(retrofit: Retrofit): CharacterService = retrofit.create(CharacterService::class.java)

    @Singleton
    @Provides
    fun provideCharacterRemoteDataSource(characterService: CharacterService) = CharacterRemoteDataSource(CharacterService::class.java)

}