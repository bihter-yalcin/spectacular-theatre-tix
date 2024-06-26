package com.project.spectacular.theatre.tix.repository

import com.project.spectacular.theatre.tix.model.entities.CustomerEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepository : JpaRepository<CustomerEntity, String> {
    @Query("SELECT c FROM CustomerEntity c WHERE c.id = :id")
    override fun findById(id: String): Optional<CustomerEntity>
}