package com.felixwc.springboot.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootTest
class BootAnnotationAppTest {
    @Autowired
    ApplicationContext context;

    @Test
    public void MainTest(){
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}