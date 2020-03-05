package com.example.spring4.services.impl;

import com.example.spring4.services.HelloWorldService;

public class HelloWorldServiceFrenchImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return ">>>> Bonjour le monde !!!";
    }
}
