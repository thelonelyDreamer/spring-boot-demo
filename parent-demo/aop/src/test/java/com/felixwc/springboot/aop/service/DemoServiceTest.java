package com.felixwc.springboot.aop.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoServiceTest {
    @Autowired
    private DemoService service;

    @Test
    public void test1() throws Exception {
        service.sayHello();
    }
}