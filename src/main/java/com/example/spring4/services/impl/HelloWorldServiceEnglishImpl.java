package com.example.spring4.services.impl;

import com.example.spring4.services.HelloWorldService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Profile("english")
//@Primary
//@Profile("default")//By default set the profile (but default profile will be overriden by the "active" profile)
//@Profile({"default","english"})
public class HelloWorldServiceEnglishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return ">>>> Hello World !!!";
    }

}
