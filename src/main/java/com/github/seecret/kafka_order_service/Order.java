package com.github.seecret.kafka_order_service;

public record Order(
        String orderId,

        String product,

        Integer quantity
) {
}
