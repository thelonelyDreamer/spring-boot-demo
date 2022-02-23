package com.felixwc.springboot.mvc.controller;

import com.felixwc.springboot.mvc.exception.MyBasicException;
import com.felixwc.springboot.mvc.exception.MyExtendException1;
import com.felixwc.springboot.mvc.exception.MyExtendException2;
import com.felixwc.springboot.mvc.handler.ResponseState;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/1/26 23:41
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/ex1")
    public ResponseState test1(){
        throw new NullPointerException();
    }

    @RequestMapping("/basic")
    public ResponseState test2() throws MyBasicException {
        throw new MyBasicException();
    }
    @RequestMapping("/extend1")
    public ResponseState test3() throws MyBasicException {
        throw new MyExtendException1();
    }
    @RequestMapping("/extend2")
    public ResponseState test4() throws MyBasicException {
        throw new MyExtendException2();
    }
}
