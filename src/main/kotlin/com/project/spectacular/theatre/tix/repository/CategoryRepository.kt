package com.project.spectacular.theatre.tix.repository

import com.project.spectacular.theatre.tix.model.entities.TicketEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

abstract class CategoryRepository : JpaRepository<TicketEntity,UUID> {


}