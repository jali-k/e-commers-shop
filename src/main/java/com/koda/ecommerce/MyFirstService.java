package com.koda.ecommerce;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

//@Service
//public class MyFirstService {
//
//
//    private Environment environment;
//
//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }
//
//    public String getJavaVersion(){
//        return environment.getProperty("java.version");
//    }
//
//
//
//}

@Service
public class MyFirstService {
    // Injecting the MyFirstClass bean with constructor injection

    private final MyFirstClass myFirstClass;

//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }

    @Resource
    private Environment environment;

    @Autowired
    public MyFirstService(
            MyFirstClass myFirstClass

    ) {
        this.myFirstClass = myFirstClass;

    }
    public String tellStory(){
        return "Once upon a time, there was a class called MyFirstClass. It said: "+ myFirstClass.sayHello();
    }

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }




}
