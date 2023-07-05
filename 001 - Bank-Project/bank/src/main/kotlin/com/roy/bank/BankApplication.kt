package com.roy.bank

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableJpaRepositories("com.roy.bank.controller.interfaces")
@EntityScan("com.roy.bank.entities")
@SpringBootApplication
@EnableTransactionManagement

class BankApplication

fun main(args: Array<String>) {
	runApplication<BankApplication>(*args)
}
