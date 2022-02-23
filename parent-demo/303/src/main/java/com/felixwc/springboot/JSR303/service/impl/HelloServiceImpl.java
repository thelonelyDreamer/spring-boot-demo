package com.felixwc.springboot.JSR303.service.impl;

import com.felixwc.springboot.JSR303.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * in order to learn java!
 * created at 2022/1/21 14:40
 *
 * @author wangchao
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "hello";
    }
}
