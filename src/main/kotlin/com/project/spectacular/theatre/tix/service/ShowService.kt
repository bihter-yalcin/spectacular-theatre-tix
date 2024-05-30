package com.project.spectacular.theatre.tix.service

import com.project.spectacular.theatre.tix.model.dtos.ShowDTO
import com.project.spectacular.theatre.tix.model.entities.ShowEntity
import com.project.spectacular.theatre.tix.model.enums.ShowType
import com.project.spectacular.theatre.tix.repository.ShowRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ShowService {

    @Autowired
    private lateinit var showRepository: ShowRepository

    fun createShow(name: String, writer: String, showType: ShowType, totalSeats: Int, availableSeats: Int) {
        showRepository.save(ShowEntity.create(name, writer, showType, totalSeats, availableSeats))
    }

    fun getShow(showId: Int): ShowDTO {
        val show = showRepository.findById(showId)
        if (show.isPresent)
            return show.get().toShowDTO()
        else
            throw Exception("No such show with id $show:")
    }

}

