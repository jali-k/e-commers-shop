package com.koda.ecommerce;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean(name = "first")
    public MyFirstClass myFirstBean (){
        return new MyFirstClass("First Bean");
    }
    @Bean(name = "second")
    public MyFirstClass mySecondBean (){
        return new MyFirstClass("Second Bean");
    }
}

