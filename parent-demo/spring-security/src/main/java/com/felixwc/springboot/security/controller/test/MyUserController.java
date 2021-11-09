package com.felixwc.springboot.security.controller.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2021/11/9 15:44
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/test")
public class MyUserController {
    @Autowired
    private ObjectMapper mapper;

    /**
     * @path
     * @return
     */
    @GetMapping("/hello")
    public String getHello() throws JsonProcessingException {
        String s = mapper.writeValueAsString(new Object());
        System.out.println(s);
        return  "hello";
    }


}
