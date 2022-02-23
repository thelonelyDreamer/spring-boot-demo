package com.felixwc.springboot.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * in order to learn java!
 * created at 2021/11/9 14:21
 *
 * @author wangchao
 */
@Controller
public class ThymeleafController {
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/test")
    public String test1(){
        return "index";
    }
}
