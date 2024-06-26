package com.project.spectacular.theatre.tix.repository

import com.project.spectacular.theatre.tix.model.entities.TicketEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TicketRepository : JpaRepository<TicketEntity, String>
