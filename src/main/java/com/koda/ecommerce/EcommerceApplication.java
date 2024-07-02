package com.koda.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(EcommerceApplication.class, args);

		MyFirstService myFirstService = new MyFirstService(ctx.getBean("second",MyFirstClass.class ));
		System.out.println(myFirstService.tellStory());
	}


}
