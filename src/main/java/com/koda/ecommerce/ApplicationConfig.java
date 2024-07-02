package com.koda.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    MyFirstClass myFirstClass (){
        return new MyFirstClass("myVar");
    }
}
