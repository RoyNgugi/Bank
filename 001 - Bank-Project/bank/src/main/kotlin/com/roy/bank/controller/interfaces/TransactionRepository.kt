package com.roy.bank.controller.interfaces

import com.roy.bank.entities.TransactionEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface TransactionRepository : JpaRepository<TransactionEntity, UUID> {
}