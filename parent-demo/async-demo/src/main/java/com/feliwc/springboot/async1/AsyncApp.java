package com.feliwc.springboot.async1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * in order to learn java!
 * created at 2022/3/9 14:44
 *
 * @author wangchao
 */
@SpringBootApplication
@EnableAsync
public class AsyncApp {
    public static void main(String[] args) {
        SpringApplication.run(AsyncApp.class,args);
    }
}
