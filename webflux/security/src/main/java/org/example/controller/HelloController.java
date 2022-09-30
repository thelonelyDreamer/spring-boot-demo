package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/9/22 17:40
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/hi")
    public String test(){
        return "hi";
    }

}
