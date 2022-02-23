package com.felixwc.springboot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * in order to learn java!
 * created at 2021/11/9 14:04
 *
 * @author wangchao
 */
@SpringBootApplication
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class BootApp {
    public static void main(String[] args) {
        SpringApplication.run(BootApp.class,args);
    }
}
