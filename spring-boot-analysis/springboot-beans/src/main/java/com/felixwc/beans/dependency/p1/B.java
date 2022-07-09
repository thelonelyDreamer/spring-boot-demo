package com.felixwc.beans.dependency.p1;

import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/7/2 01:13
 *
 * @author felixwc
 */
@Component
public class B {
    private A a;

    public B(A a) {
        this.a = a;
    }
}
