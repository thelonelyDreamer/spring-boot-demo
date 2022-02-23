package com.felixwc.springboot.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * in order to learn java!
 * created at 2022/2/6 02:13
 *
 * @author wangchao
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class BootAopApp {
    public static void main(String[] args) {
        SpringApplication.run(BootAopApp.class,args);
    }
}
