package com.example.spring4.services.impl;

import com.example.spring4.services.HelloWorldService;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language){

        HelloWorldService helloWorldService = null;

        switch(language){

            case "en":
                helloWorldService = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                helloWorldService = new HelloWorldSpanishImpl();
                break;
            case "ef":
                helloWorldService = new HelloWorldServiceFrenchImpl();
                break;
            case "eg":
                helloWorldService = new HelloWorldServiceGermanImpl();
                break;
            default: new HelloWorldServiceEnglishImpl();
        }

        return helloWorldService;

    }

}
