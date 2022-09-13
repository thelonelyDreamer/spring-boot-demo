package com.felixwc.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * in order to learn java!
 * created at 2022/9/9 19:04
 *
 * @author felixwc
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/{id}")
    public String method(@PathVariable String id){
        String target=null;
        switch (id){
            case "1":
                break;
            default:
                target="index";
                break;
        }
        return target;
    }
}
