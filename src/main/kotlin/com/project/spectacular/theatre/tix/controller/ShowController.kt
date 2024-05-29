package com.project.spectacular.theatre.tix.controller

import com.project.spectacular.theatre.tix.model.dtos.ShowDTO
import com.project.spectacular.theatre.tix.model.enums.ShowType
import com.project.spectacular.theatre.tix.service.ShowService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/shows")
class ShowController {

    @Autowired
    private lateinit var service: ShowService

    @GetMapping("/{showId}")
    fun getShow(@PathVariable showId: Int): ShowDTO {
        return service.getShow(showId)
    }

    @PostMapping
    fun createShow(
        @RequestBody
        name: String,
        writer: String,
        showType: ShowType,
        totalSeats: Int,
        availableSeats: Int
    ) {
        return service.createShow(name, writer, showType, totalSeats, availableSeats)
    }
}
