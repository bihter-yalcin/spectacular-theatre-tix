package com.project.spectacular.theatre.tix.model.entities

import jakarta.persistence.OneToOne
import jakarta.persistence.Version
import java.sql.Timestamp

data class TicketEntity(
    var id: Long,

    @OneToOne
    var showEntity: ShowEntity,

    var bookDate: Timestamp,

    @Version
    var version: Long
)
