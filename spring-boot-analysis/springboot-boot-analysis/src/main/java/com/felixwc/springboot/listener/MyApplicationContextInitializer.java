package com.felixwc.springboot.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * in order to learn java!
 * created at 2022/2/24 21:56
 *
 * @author wangchao
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("initialize in ApplicationContextInitializer");
    }
}
