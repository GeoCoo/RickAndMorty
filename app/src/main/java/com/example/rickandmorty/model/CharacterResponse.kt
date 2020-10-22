package com.example.rickandmorty.model

data class CharacterResponse(
    @JvmField val info: Info,
    @JvmField val results:List<CharacterModel>

)

data class Info(
    @JvmField val count : Int,
    @JvmField val pages:Int,
    @JvmField val next:String?,
    @JvmField val prev:String?
)