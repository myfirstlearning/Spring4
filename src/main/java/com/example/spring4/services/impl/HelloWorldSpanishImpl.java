package com.example.spring4.services.impl;

import com.example.spring4.services.HelloWorldService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("sapnish")
public class HelloWorldSpanishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return ">>> Hola mundo !!!";
    }

}
