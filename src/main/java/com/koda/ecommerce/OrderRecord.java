package com.koda.ecommerce;

public record OrderRecord(
        String name,
        String product,
        double price
) {
}
