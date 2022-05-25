package com.felixwc.springboot.annotation.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyConfigurationTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void configurationAnnotationTest(){
        MyConfiguration.ConfigurationInner configurationInner = context.getBean("configurationInner", MyConfiguration.ConfigurationInner.class);
        MyConfiguration bean = context.getBean(MyConfiguration.class);
        System.out.println(bean.configurationInner()==configurationInner);
    }
}