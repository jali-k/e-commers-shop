package com.koda.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyFirstController {

//    @GetMapping("/hello")
//    public String hello() {
//        return "Hello, World!";
//    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String message){
        return "You just called the POST method at '/hello'!\n: " + message;
    }
    @PostMapping("/order")
    public String helloPost(@RequestBody Order order){
        return "You just called the POST method at '/hello'!\n: " + order.toString();
    }

    @PostMapping("/order-record")
    public String helloPost(@RequestBody OrderRecord order){
        return "You just called the POST method with order record at /orderRecord!\n: " + order.toString();
    }

    @GetMapping("/hello/{my-name}")
    public String helloName(@PathVariable("my-name") String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("/hello")
    public String useParam(@RequestParam("my-name") String name){
        return "Hello, " + name + "!";
    }

}

