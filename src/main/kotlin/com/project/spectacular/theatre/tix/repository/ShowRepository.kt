package com.project.spectacular.theatre.tix.repository

import com.project.spectacular.theatre.tix.model.entities.ShowEntity
import jakarta.persistence.LockModeType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Lock
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ShowRepository : JpaRepository<ShowEntity, Int> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    override fun findById(id: Int): Optional<ShowEntity>
}