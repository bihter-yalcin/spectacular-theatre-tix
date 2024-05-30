package com.project.spectacular.theatre.tix.controller

import com.project.spectacular.theatre.tix.model.dtos.TicketDTO
import com.project.spectacular.theatre.tix.service.TicketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tickets")
class TicketController {

    @Autowired
    private lateinit var service: TicketService

    @GetMapping("/{ticketId}")
    fun getTicket(@PathVariable ticketId: String): TicketDTO {
        return service.getTicket(ticketId)
    }

    @PostMapping("/book")
    fun bookTicket(@RequestParam showId: Long, @RequestParam customerId: String) {
        return service.bookTicket(showId, customerId)
    }
}
