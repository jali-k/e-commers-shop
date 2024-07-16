package com.koda.ecommerce;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    public School(String name) {
        this.name = name;
    }

    public School() {
    }
}













