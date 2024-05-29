package com.project.spectacular.theatre.tix.model.dtos

import com.project.spectacular.theatre.tix.model.enums.Tier

data class CustomerDTO(
    var name: String,
    var surname: String,
    var tier: Tier,
)