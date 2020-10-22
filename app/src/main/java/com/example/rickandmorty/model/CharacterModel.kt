package com.example.rickandmorty.model

data class CharacterModel(
    @JvmField var id: Int,
    @JvmField var name: String,
    @JvmField var status: String,
    @JvmField var species: String,
    @JvmField var type: String?,
    @JvmField var gender: String,
    @JvmField var origin: Origin,
    @JvmField val location: Location,
    @JvmField val image: String,
    @JvmField val episode: List<String>,
    @JvmField val url: String,
    @JvmField val created: String


)

data class Origin(@JvmField val name: String, @JvmField val url: String)
data class Location(@JvmField val name: String, @JvmField val url: String)

