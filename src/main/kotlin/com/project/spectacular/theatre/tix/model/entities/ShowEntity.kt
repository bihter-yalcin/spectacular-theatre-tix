package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.enums.ShowType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "shows")
data class ShowEntity(
    @Id
    @GeneratedValue
    var id: Long,
    var name: String,
    var writer: String,
    var type: ShowType,
    var totalSeats: Int,
    var availableSeats: Int
)
