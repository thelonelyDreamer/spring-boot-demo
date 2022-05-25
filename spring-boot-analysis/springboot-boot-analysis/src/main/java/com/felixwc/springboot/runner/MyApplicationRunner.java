package com.felixwc.springboot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/2/24 22:01
 *
 * @author wangchao
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("run in ApplicationRunner");
    }
}
