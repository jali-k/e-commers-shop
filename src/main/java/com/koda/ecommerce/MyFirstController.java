package com.koda.ecommerce;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyFirstController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }


    @PostMapping("/post")
    public String post(@RequestBody String message){
        return "You just called the POST method at '/post'!\n: " +message;
    }


}

