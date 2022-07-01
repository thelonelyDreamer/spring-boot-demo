package com.felixwc.beans;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BeanFactoryAppTest {

    @Test
    public void test1(){
        BigDecimal bigDecimal = new BigDecimal("0.4");
        BigDecimal bigDecimal1 = new BigDecimal("0.3");
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(0.4-0.3==0.4/4);
    }
}