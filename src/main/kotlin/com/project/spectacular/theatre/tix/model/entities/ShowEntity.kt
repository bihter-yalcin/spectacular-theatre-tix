package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.enums.ShowType
import jakarta.persistence.*

@Entity
@Table(name = "shows")
data class ShowEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "showId")
    var id: Long,
    var name: String,
    var writer: String,

    @Enumerated(EnumType.STRING)
    var type: ShowType,

    var totalSeats: Int,

    var availableSeats: Int
)
