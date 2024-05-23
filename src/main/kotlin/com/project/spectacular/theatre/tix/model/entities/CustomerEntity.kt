package com.project.spectacular.theatre.tix.model.entities

import com.project.spectacular.theatre.tix.model.enums.Tier
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.Version

@Entity
@Table(name = "customer")
data class CustomerEntity(

    @Id
    var id: String,

    var name: String,

    var surname: String,

    var tier: Tier,

    @Version
    var version: Long

)
