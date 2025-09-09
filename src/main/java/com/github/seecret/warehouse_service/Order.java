package com.github.seecret.warehouse_service;

public record Order(
        String orderId,

        String product,

        Integer quantity
) {
}
