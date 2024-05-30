package com.project.spectacular.theatre.tix.controller

import com.project.spectacular.theatre.tix.model.dtos.CustomerDTO
import com.project.spectacular.theatre.tix.service.CustomerService
import com.project.spectacular.theatre.tix.service.ShowService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController {

    @Autowired
    private lateinit var service: CustomerService

    @GetMapping("/{customerId}")
    fun getCustomer(@PathVariable customerId: String): CustomerDTO {
        return service.getCustomer(customerId)
    }

    @PostMapping
    fun createCustomer(
        @RequestBody
        customerDTO: CustomerDTO
    ) {
        return service.createCustomer(customerDTO)
    }
}
