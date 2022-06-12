package com.feliwc.springboot.async1.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * in order to learn java!
 * created at 2022/3/9 14:47
 *
 * @author wangchao
 */
@Service
public class AsyncService {

    @Async
    public void async1(){
        System.out.println("this is async1 in AsyncService");
    }

    @Async
    public Future<String> asyncWithReturn(){
        return new AsyncResult<String>("asyncWithReturn()");
    }

}
