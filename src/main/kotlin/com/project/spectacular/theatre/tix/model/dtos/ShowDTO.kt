package com.project.spectacular.theatre.tix.model.dtos

import com.project.spectacular.theatre.tix.model.enums.ShowType

data class ShowDTO(
    var name: String,
    var writer: String,
    var type: ShowType,
    var totalSeats: Int,
    var availableSeats: Int
)