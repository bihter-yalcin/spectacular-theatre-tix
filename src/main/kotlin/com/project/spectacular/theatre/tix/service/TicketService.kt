package com.project.spectacular.theatre.tix.service

import com.project.spectacular.theatre.tix.model.dtos.TicketDTO
import com.project.spectacular.theatre.tix.model.entities.CustomerEntity
import com.project.spectacular.theatre.tix.model.entities.ShowEntity
import com.project.spectacular.theatre.tix.model.entities.TicketEntity
import com.project.spectacular.theatre.tix.repository.CustomerRepository
import com.project.spectacular.theatre.tix.repository.ShowRepository
import com.project.spectacular.theatre.tix.repository.TicketRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TicketService {
    @Autowired
    private lateinit var ticketRepository: TicketRepository

    @Autowired
    private lateinit var showRepository: ShowRepository

    @Autowired
    private lateinit var customerRepository: CustomerRepository

    fun getTicket(ticketId: String): TicketDTO {
        val ticket = ticketRepository.findById(ticketId)
        if (ticket.isPresent)
            return ticket.get().toTicketDTO()
        else
            throw Exception("No such ticket with id $ticket:")
    }

    @Transactional
    fun bookTicket(showId: Long, customerId: String) {
        val show = retrieveShow(showId)
        val customer = retrieveCustomer(customerId)

        show.decreaseAvailableSeat()

        val ticket = TicketEntity.create(show, customer)
        ticketRepository.save(ticket)

    }

    private fun retrieveShow(showId: Long): ShowEntity {
        val show = showRepository.findById(showId.toInt())
        if (show.isPresent)
            return show.get()
        else
            throw Exception("No such show with id $showId:")
    }

    private fun retrieveCustomer(customerId: String): CustomerEntity {
        val customer = customerRepository.findById(customerId)
        return if (customer.isPresent)
            customer.get() else
            throw Exception("No such customer with id $customerId:")
    }


}

