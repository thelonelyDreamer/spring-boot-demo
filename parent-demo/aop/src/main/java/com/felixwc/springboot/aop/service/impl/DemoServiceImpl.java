package com.felixwc.springboot.aop.service.impl;

import com.felixwc.springboot.aop.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * in order to learn java!
 * created at 2022/2/6 17:41
 *
 * @author wangchao
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() throws Exception {
        Random random = new Random();
        int i = random.nextInt();
        if(i%2==0){
            throw new Exception();
        }
        System.out.println("这是业务部分");
        return "hello";
    }
}
