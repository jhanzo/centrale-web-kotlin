package com.jho.centrale

import com.jho.centrale.model.Sale
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SaleRepository: JpaRepository<Sale, Long>