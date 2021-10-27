package com.jho.centrale

import com.jho.centrale.model.Sale
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SaleRepository: JpaRepository<Sale, Long>

/*
import java.util.*

enum class SaleType {
    FAVORITE, UPCOMING, EMPTY
}

open class Sale {
    private var price: Double
    val title: String
    val description: String
    val expiredAt: Date?
    val type: SaleType

    constructor(title: String, description: String, price: Double, expiredAt: Date?, type: SaleType) {
        this.title = title
        this.description = description
        this.price = price
        this.expiredAt = expiredAt
        this.type = type
    }

    fun getPrice(): Double {
        return this.price
    }
}*/