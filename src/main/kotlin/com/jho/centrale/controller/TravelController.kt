package com.jho.centrale.controller

import com.jho.centrale.SaleRepository
import com.jho.centrale.model.Sale
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("travel")
class TravelController(private val saleRepository: SaleRepository) {

    @GetMapping("sales")
    fun getAllSales(): List<Sale> {
        return saleRepository.findAll()
    }

    @PostMapping
    fun addSale(@Valid @RequestBody sale: Sale): Sale {
        return saleRepository.save(sale)
    }
}