package com.koda.ecommerce;

public class MyFirstService {
    // Injecting the MyFirstClass bean with constructor injection

    public final MyFirstClass myFirstClass;

    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public String tellStory(){
        return "The dependency says: " + myFirstClass.sayHello();
    }
}
