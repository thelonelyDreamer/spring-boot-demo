package com.felixwc.springboot.annotation.components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class MyComponentTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void componentAnnotationTest(){
        MyComponent.ComponentInner bean = context.getBean(MyComponent.ComponentInner.class);
        MyComponent bean1 = context.getBean(MyComponent.class);
        System.out.println(bean==bean1.componentInner());//false
    }
}