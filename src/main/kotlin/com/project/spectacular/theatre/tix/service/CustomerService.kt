package com.project.spectacular.theatre.tix.service

import com.project.spectacular.theatre.tix.model.dtos.CustomerDTO
import com.project.spectacular.theatre.tix.model.entities.CustomerEntity
import com.project.spectacular.theatre.tix.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {
    @Autowired
    private lateinit var customerRepository: CustomerRepository
    fun createCustomer(name: String, surname: String) {
        customerRepository.save(CustomerEntity.create(name, surname))
    }

    fun getCustomer(customerId: String): CustomerDTO {
        val customer = customerRepository.findById(customerId)
        if (customer.isPresent)
            return customer.get().toCustomerDTO()
        else
            throw Exception("No such customer with id ${customerId}:")
    }

}

