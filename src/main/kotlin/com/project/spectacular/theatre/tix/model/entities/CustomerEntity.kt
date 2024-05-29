package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.dtos.CustomerDTO
import com.project.spectacular.theatre.tix.model.enums.Tier
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "customers")
data class CustomerEntity(

    @Id
    @Column(name = "customerId")
    var id: String,

    var name: String,

    var surname: String,

    @Enumerated(EnumType.STRING)
    var tier: Tier,

    @Version
    var version: Long

) {
    fun updateCustomerTier(tier: Tier) {
        this.tier = tier
    }

    companion object {
        fun create(name: String, surname: String): CustomerEntity {
            return CustomerEntity(UUID.randomUUID().toString(), name, surname, Tier.BRONZE, 0)
        }
    }

    fun toCustomerDTO(): CustomerDTO {
        return CustomerDTO(this.name, this.surname, this.tier)
    }
}
