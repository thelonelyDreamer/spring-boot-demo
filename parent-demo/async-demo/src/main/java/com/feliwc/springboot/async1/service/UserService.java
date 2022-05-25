package com.feliwc.springboot.async1.service;

import org.springframework.stereotype.Service;

/**
 * in order to learn java!
 * created at 2022/3/9 14:45
 *
 * @author wangchao
 */
@Service
public class UserService {
    private AsyncService service;

    public UserService(AsyncService service) {
        this.service = service;
    }

    public void test1(){
        service.async1();
        System.out.println("this is test1 in UserService");
    }
}
