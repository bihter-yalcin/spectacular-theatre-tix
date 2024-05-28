package com.project.spectacular.theatre.tix.model.dtos

import com.project.spectacular.theatre.tix.model.entities.CustomerEntity
import com.project.spectacular.theatre.tix.model.entities.ShowEntity
import com.project.spectacular.theatre.tix.model.enums.ShowType
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import java.sql.Timestamp

data class ShowDTO(
    var name: String,
    var writer: String,
    var type: ShowType,
    var totalSeats: Int,
    var availableSeats: Int
)