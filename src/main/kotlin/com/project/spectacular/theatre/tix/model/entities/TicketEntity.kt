package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.dtos.TicketDTO
import jakarta.persistence.*
import java.sql.Timestamp
import java.util.*

@Entity
@Table(name = "tickets")
data class TicketEntity(

    @Id
    @Column(name = "ticketId")
    var id: String,

    @ManyToOne
    @JoinColumn(name = "showId")
    var show: ShowEntity,

    @Column(name = "bookDate")
    var bookDate: Timestamp,

    @ManyToOne
    @JoinColumn(name = "customerId")
    var customer: CustomerEntity,

    @Version
    var version: Long
) {
    companion object {
        fun create(show: ShowEntity, customer: CustomerEntity): TicketEntity {
            return TicketEntity(UUID.randomUUID().toString(), show, Timestamp(System.currentTimeMillis()), customer, 0L)
        }

    }

    fun toTicketDTO(): TicketDTO {
        return TicketDTO(this.id, this.show, this.bookDate, this.customer)
    }

}