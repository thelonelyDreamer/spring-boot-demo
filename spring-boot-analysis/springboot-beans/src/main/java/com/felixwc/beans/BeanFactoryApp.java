package com.felixwc.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * in order to learn java!
 * created at 2022/4/8 13:40
 *
 * @author wangchao
 */
@SpringBootApplication
public class BeanFactoryApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BeanFactoryApp.class, args);
    }
}
