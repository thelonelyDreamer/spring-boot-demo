package com.felixwc.springboot.JSR303.controller;

import com.felixwc.springboot.JSR303.pojo.vo.HelloObject;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * in order to learn java!
 * created at 2022/1/21 14:48
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/param1")
    public String param1(@NotNull String name){
        return  name;
    }

    @PostMapping("/object")
    public String post303(@RequestBody @Valid HelloObject object){
        System.out.println(object.getName());
        return "hello";
    }
}
