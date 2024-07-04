package com.koda.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyFirstController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String message){
        return "You just called the POST method at '/hello'!\n: " + message;
    }
    @PostMapping("/order")
    public String helloPost(@RequestBody Order order){
        return "You just called the POST method at '/hello'!\n: " + order.toString();
    }

}

