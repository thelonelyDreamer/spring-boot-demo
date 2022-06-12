package com.felixwc.springboot;

import org.junit.jupiter.api.Test;

class BootAppAnalysisTest {

    @Test
    public void test(){
        System.out.println(-1>>>16);
        System.out.println(1^(1>>>16));
    }
}