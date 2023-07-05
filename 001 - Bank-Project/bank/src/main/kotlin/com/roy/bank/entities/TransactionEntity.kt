package com.roy.bank.entities

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "transactions" ,schema= "transactionsdb")
class TransactionEntity(

    @JsonProperty("id")
    @Id
    @Column(name = "id")
    var id: UUID?=null,

    @JsonProperty("date")
    @Column(name = "date")
    var date: String?=null,

    @JsonProperty("accountidentifier")
    @Column(name = "accountidentifier")
    val accountidentifier: String?,

    @JsonProperty("value")
    @Column(name = "value")
    val value: Double?,

    @JsonProperty("description")
    @Column(name = "description")
    val description: String?,




    )