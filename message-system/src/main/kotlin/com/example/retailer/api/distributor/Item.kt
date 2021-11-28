package com.example.retailer.api.distributor

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "items")
data class Item(

    @Id
    val id: Long,

    @Column
    val name: String
)