package com.example.spring4;

import com.example.spring4.services.HelloWorldService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:/spring/greeting-config.xml","classpath*:/spring/english-greeting.xml"})
public class EnglishIntegrationTest {

    @Autowired
    HelloWorldService helloWorldService;

    @Ignore
    @Test
    public void testHelloWorld(){
        String greeting = helloWorldService.getGreeting();
        Assert.assertEquals(">>>> Hello World !!!", greeting);
    }

}
