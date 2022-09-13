package com.felixwc.controller.p1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * in order to learn java!
 * created at 2022/9/6 22:04
 *
 * @author felixwc
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @RequestMapping("/m1")
    public String m1(HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest);
        return null;
    }
}
