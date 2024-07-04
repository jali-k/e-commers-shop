package com.koda.ecommerce;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    // Postman test
//    {
//        "Another name": "Test name",
//            "product": "Test product",
//            "price": 35
//
//    }
    @JsonProperty("Another name")
    private String name;
    private String product;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +

                ", price=" + price +
                '}';
    }
}
