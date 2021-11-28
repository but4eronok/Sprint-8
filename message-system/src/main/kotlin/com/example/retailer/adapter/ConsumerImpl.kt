package com.example.retailer.adapter

import com.example.retailer.api.distributor.OrderInfo
import com.example.retailer.service.OrderService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired

class ConsumerImpl: Consumer {
    @Autowired
    private lateinit var orderService: OrderService


    @RabbitListener(queues = ["#{queue.name}"])
    override fun receive(orderInfo: String) {
        val mapper = ObjectMapper()
        val orderInfo = mapper.readValue(orderInfo, OrderInfo::class.java)
        orderService.updateOrderInfo(orderInfo)
    }
}