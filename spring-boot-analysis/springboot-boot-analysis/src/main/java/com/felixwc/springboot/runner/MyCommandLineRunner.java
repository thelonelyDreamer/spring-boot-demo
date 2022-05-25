package com.felixwc.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/2/24 22:03
 *
 * @author wangchao
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("run in CommandLineRunner");
    }
}
