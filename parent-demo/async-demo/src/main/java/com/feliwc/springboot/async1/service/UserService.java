package com.feliwc.springboot.async1.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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

    public void test1() throws ExecutionException, InterruptedException {
        service.async1();
        Future<String> stringFuture = service.asyncWithReturn();
        if(stringFuture.isDone()){
            String s = stringFuture.get();
            System.out.println(s);
        }
        System.out.println("this is test1 in UserService");
    }
}
