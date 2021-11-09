package com.felixwc.springboot.thymeleaf.controller;

import com.felixwc.springboot.thymeleaf.pojo.test.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user/{name}")
    public String testUser(@PathVariable String name,Model model){
        UserVO userVO = new UserVO().setName(name);
        model.addAttribute("user",userVO);
        return "test/user";
    }
}
