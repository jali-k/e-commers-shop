package com.koda.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    // Injecting the MyFirstClass bean with constructor injection

    private final MyFirstClass myFirstClass;


    public MyFirstService(
            @Qualifier("second") MyFirstClass myFirstClass
    ) {
        this.myFirstClass = myFirstClass;
    }
    public String tellStory(){
        return "Once upon a time, there was a class called MyFirstClass. It said: "+ myFirstClass.sayHello();
    }


}
