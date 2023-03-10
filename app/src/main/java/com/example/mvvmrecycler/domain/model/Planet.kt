package com.example.mvvmrecycler.domain.model

data class Planet (

    val name: String,
    val rotation_period: String,
    val orbital_period: String,
    val diameter: String,
    val climate: String,
    val gravity: String,
    val terrain: String,
    val surface_water: String,
    val population: String,
    var residents: List<String>,
    var films: List<String>,
    val created: String,
    val edited: String,
    val url: String

        )