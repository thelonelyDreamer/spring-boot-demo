package com.felixwc.springboot.aop.controller;

import com.felixwc.springboot.aop.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/2/6 03:21
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/demo")
public class HelloAdviceController {
    private final DemoService demoService;
    public HelloAdviceController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/test")
    public String test(){
        String s = null;
        try {
            s = demoService.sayHello();
        } catch (Exception e) {
            s = e.getMessage();
            e.printStackTrace();
        }
        return s;
    }
}
