package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.enums.Tier
import jakarta.persistence.*

@Entity
@Table(name = "customers")
data class CustomerEntity(

    @Id
    @Column(name="customerId")
    var id: String,

    var name: String,

    var surname: String,

    @Enumerated(EnumType.STRING)
    var tier: Tier,

    @Version
    var version: Long

)
