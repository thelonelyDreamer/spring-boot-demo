package com.felixwc.springboot.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class AnnotationServiceTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void annotationTest(){
        AnnotationService bean = context.getBean(AnnotationService.class);
        bean.annotationTest();
    }
}