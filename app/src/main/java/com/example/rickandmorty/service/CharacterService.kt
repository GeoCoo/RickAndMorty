package com.example.rickandmorty.service

import com.example.rickandmorty.model.CharacterModel
import com.example.rickandmorty.model.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getCharacters(): Response<CharacterResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<CharacterModel>

}