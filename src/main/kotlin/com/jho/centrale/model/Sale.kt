package com.jho.centrale.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Sale (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @get: NotBlank
    val title: String = "",

    @get: NotBlank
    val description: String = ""
)

/*

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