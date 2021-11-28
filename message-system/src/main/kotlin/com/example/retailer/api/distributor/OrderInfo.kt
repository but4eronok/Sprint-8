package com.example.retailer.api.distributor

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.Id

@Entity
data class OrderInfo(

    @Id
    val orderId: String,

   @Column
    var status: OrderStatus,

    @Column
    val signature: String,

)