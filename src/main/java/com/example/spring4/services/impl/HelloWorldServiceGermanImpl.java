package com.example.spring4.services.impl;

import com.example.spring4.services.HelloWorldService;
import org.springframework.stereotype.Component;

//@Component
public class HelloWorldServiceGermanImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return ">>>> Hallo Welt !!!";
    }
}
