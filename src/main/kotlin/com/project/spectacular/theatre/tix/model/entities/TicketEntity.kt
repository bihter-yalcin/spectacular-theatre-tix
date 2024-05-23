package com.project.spectacular.theatre.tix.model.entities

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "tickets")
data class TicketEntity(

    @Id
    var id: String,

    @ManyToOne
    var showEntity: ShowEntity,

    var bookDate: Timestamp,

    @ManyToOne
    var customer: CustomerEntity,

    @Version
    var version: Long
)
