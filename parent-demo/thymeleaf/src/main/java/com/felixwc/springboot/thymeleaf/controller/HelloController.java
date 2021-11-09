package com.felixwc.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * in order to learn java!
 * created at 2021/11/9 11:24
 *
 * @author wangchao
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("hello","hello-string");
        return "hello";
    }

    @GetMapping("/hi")
    @ResponseBody
    public String hi(){
        return "hi";
    }
}
