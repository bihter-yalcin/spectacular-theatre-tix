package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.enums.ShowType
import jakarta.persistence.*

@Entity
@Table(name = "shows")
data class ShowEntity(

    var name: String,
    var writer: String,

    @Enumerated(EnumType.STRING)
    var type: ShowType,

    var totalSeats: Int,

    var availableSeats: Int
) {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "showId")
    var id: Long = 0

    fun decreaseAvailableSeat() {
        if (this.availableSeats > 0)
            this.availableSeats -= 1
        else throw Exception("No available seats for show: ${this.name}:")
    }

    companion object {
        fun create(name: String, writer: String, type: ShowType, totalSeats: Int, availableSeats: Int): ShowEntity {
            return ShowEntity(
                name = name,
                writer = writer,
                type = type,
                totalSeats = totalSeats,
                availableSeats = availableSeats
            )
        }
    }

}