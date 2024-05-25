package com.project.spectacular.theatre.tix.model.entities

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "tickets")
data class TicketEntity(

    @Id
    @Column(name="ticketId")
    var id: String,

    @ManyToOne
    @JoinColumn(name = "showId")
    var showEntity: ShowEntity,

    @Column(name="bookDate")
    var bookDate: Timestamp,

    @ManyToOne
    @JoinColumn(name = "customerId")
    var customer: CustomerEntity,

    @Version
    var version: Long
)
