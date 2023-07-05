package com.roy.bank.controller.interfaces

import com.roy.bank.entities.TransactionEntity
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional
class TransactionService(private val transactionRepository: TransactionRepository) {
    fun saveTransaction(
        accountIdentifier: String?,
        value: Double?,
        description: String?,
        id: UUID,
        date: String
    ): TransactionEntity {
        // Make sure the return type here is TransactionDBModel
        var transaction = TransactionEntity(
            accountidentifier = accountIdentifier,
            value = value,
            description = description,
            id = id,
            date = date
        )

        return transactionRepository.save(transaction)
    }

    fun getAllTransactions(): List<TransactionEntity> {
        return transactionRepository.findAll()
    }

    fun deleteTransactionById(id: UUID) {
        transactionRepository.deleteById(id)
    }
}
