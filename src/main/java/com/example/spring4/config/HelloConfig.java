package com.example.spring4.config;

import com.example.spring4.services.HelloWorldService;
import com.example.spring4.services.impl.HelloWorldFactory;
import com.example.spring4.services.impl.HelloWorldServiceEnglishImpl;
import com.example.spring4.services.impl.HelloWorldSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory beanFactory){
        return beanFactory.createHelloWorldService("en");
    }

    @Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory beanFactory){
        return beanFactory.createHelloWorldService("es");
    }

    @Bean
    //@Profile("french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory beanFactory){
        return beanFactory.createHelloWorldService("ef");
    }

    @Bean
    //@Profile("germany")
    public HelloWorldService helloWorldServiceGermany(HelloWorldFactory beanFactory){
        return beanFactory.createHelloWorldService("eg");
    }


    /*@Bean
    @Profile("english")
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldSpanishImpl();
    }*/

}
