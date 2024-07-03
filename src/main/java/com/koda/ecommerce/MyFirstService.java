package com.koda.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

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
@PropertySource("classpath:custom.properties")
public class MyFirstService {
    // Injecting the MyFirstClass bean with constructor injection

    private final MyFirstClass myFirstClass;



    @Value("${my.prop}")
    private String CustomProperty;

    public String getCustomProperty() {
        return CustomProperty;
    }

//    @Autowired
//    public void setEnvironment(Environment environment) {
//        this.environment = environment;
//    }


    @Autowired
    public MyFirstService(
            MyFirstClass myFirstClass

    ) {
        this.myFirstClass = myFirstClass;

    }
    public String tellStory(){
        return "Once upon a time, there was a class called MyFirstClass. It said: "+ myFirstClass.sayHello();
    }






}
