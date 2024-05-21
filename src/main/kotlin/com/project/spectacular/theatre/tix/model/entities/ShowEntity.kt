package com.project.spectacular.theatre.tix.model.entities

data class ShowEntity(
    var id: Long,
    var name: String,
    var totalSeats: Int,
    var availableSeats: Int
)
