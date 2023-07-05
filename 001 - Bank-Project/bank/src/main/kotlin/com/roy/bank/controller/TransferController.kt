package com.roy.bank.controller

import com.roy.bank.controller.interfaces.TransactionService
import com.roy.bank.entities.TransactionEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/transfer")
class TransferController( val transactionService: TransactionService) {


    @DeleteMapping("/{id}")
    fun deleteTransaction(@PathVariable id: UUID) {
        transactionService.deleteTransactionById(id)
    }

    @GetMapping("/all")
    fun getAllTransactions(): List<TransactionEntity> {
        return transactionService.getAllTransactions()
    }

@PostMapping("/new")
fun createTransaction(@RequestBody request: TransactionEntity) {
    val accountidentifier = request.accountidentifier
    val value = request.value
    val description = request.description
    val id= UUID.randomUUID()
    val date = Date().toString()



    transactionService.saveTransaction(accountidentifier, value, description, id,date)
}
}





