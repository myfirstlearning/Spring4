package com.example.spring4.services.impl;

import com.example.spring4.services.FinalGreetingService;
import org.springframework.stereotype.Component;

@Component
public class FinalGreetingSericeImpl implements FinalGreetingService {


    @Override
    public String getFinalGreeting() {
        return ">>>> Final Greetings !!!";
    }
}
