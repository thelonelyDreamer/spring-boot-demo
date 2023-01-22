package com.felixwc.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/11/12 17:34
 *
 * @author felixwc
 */
@Component
public class B {
    private A a;

    public B(){
        System.out.println("无参");
    }
    @Autowired
    public B(A a) {
        System.out.println("B A");
        this.a = a;
    }
}
