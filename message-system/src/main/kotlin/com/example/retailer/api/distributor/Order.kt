package com.example.retailer.api.distributor

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
@Table(name = "orders")
data class Order(
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    val id: String?,

    @Column
    val address: String,

    @Column
    val recipient: String,

    @OneToMany(cascade = [CascadeType.ALL])
    val items: List<Item>
)