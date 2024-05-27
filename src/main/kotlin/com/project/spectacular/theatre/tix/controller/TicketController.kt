package com.project.spectacular.theatre.tix.controller

import com.project.spectacular.theatre.tix.model.dtos.TicketDTO
import com.project.spectacular.theatre.tix.service.TicketService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tickets")
class TicketController {

    private lateinit var service: TicketService

    @GetMapping("/{ticketId}")
    fun getTicket(@PathVariable ticketId: String): TicketDTO {
        return service.getTicket(ticketId)
    }

    @PostMapping
    fun bookTicket(showId: Long, customerId: String) {
        return service.bookTicket(showId, customerId)
    }
}
