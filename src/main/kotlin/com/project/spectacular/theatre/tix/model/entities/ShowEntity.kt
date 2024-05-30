package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.dtos.ShowDTO
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

    fun increaseAvailableSeat() {
        if (this.availableSeats + 1 <= this.totalSeats) {
            this.availableSeats += 1
        } else throw Exception("")
    }

    fun toShowDTO(): ShowDTO {
        return ShowDTO(this.name, this.writer, this.type, this.totalSeats, this.availableSeats)
    }

    companion object {
        fun create(showDTO: ShowDTO): ShowEntity {
            return ShowEntity(
                showDTO.name,
                showDTO.writer,
                showDTO.type,
                showDTO.totalSeats,
                showDTO.availableSeats
            )
        }
    }

}