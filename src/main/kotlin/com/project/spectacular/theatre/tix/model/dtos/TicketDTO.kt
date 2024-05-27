package com.project.spectacular.theatre.tix.model.dtos

import com.project.spectacular.theatre.tix.model.entities.CustomerEntity
import com.project.spectacular.theatre.tix.model.entities.ShowEntity
import java.sql.Timestamp

data class TicketDTO(
    var id: String,
    var show: ShowEntity,
    var bookDate: Timestamp,
    var customer: CustomerEntity
)