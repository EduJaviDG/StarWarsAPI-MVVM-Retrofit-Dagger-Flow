package com.example.mvvmrecycler.domain.model

data class StarShip (

    val name: String,
    val model: String,
    val manufacturer: String,
    val cost_in_credits: String,
    val length: String,
    val max_atmosphering_speed: String,
    val crew: String,
    val passengers: String,
    val cargo_capacity: String,
    val consumables: String,
    val hyperdrive_rating: String,
    val MGLT: String,
    val starship_class: String,
    var pilots: List<String>,
    var films: List<String>,
    val created: String,
    val edited: String,
    val url: String

        )