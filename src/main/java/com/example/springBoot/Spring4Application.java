package com.example.springBoot;

import com.example.spring4.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class Spring4Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(com.example.springBoot.Spring4Application.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();

    }

}
