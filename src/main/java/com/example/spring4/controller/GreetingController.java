package com.example.spring4.controller;


import com.example.spring4.services.FinalGreetingService;
import com.example.spring4.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller //commenting to test XML Configuration in SpringBoot
public class GreetingController {

    //@Autowired
    private HelloWorldService helloWorldService;

   /* @Autowired //Qualifier
    @Qualifier("helloWorldServiceGermanImpl")
    private HelloWorldService helloWorldGermanService;*/

    @Autowired
    private FinalGreetingService finalGreetingService;

    //@Autowired
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    /*public void setHelloWorldGermanService(HelloWorldService helloWorldGermanService) {
        this.helloWorldGermanService = helloWorldGermanService;
    }*/


    public String sayHello(){

        String greeting = helloWorldService.getGreeting();
        System.out.println("***********************************");
        System.out.println(">>>> Invoking HelloWorld Service : " + greeting);

       /* String germanGreeting = helloWorldGermanService.getGreeting();
        System.out.println("***********************************");
        System.out.println(">>>> Invoking HelloWorld Service : " + germanGreeting);*/

        String finalGreeting = finalGreetingService.getFinalGreeting();
        System.out.println("***********************************");
        System.out.println(">>>> Invoking FinalGreeting Service : " + finalGreeting);

        return greeting + finalGreeting;
    }


}
