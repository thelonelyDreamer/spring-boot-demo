package com.felixwc.springboot;

import org.junit.jupiter.api.Test;

/**
 * in order to learn java!
 * created at 2022/11/12 17:25
 *
 * @author felixwc
 */

public class AnotherTest {
    @Test
    public void test(){
        Class<A> aClass = A.class;
    }

    public static class A{
        String name;

        public A(String name) {
            this.name = name;
        }
    }
}
