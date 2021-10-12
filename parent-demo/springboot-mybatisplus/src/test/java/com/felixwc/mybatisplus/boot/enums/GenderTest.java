package com.felixwc.mybatisplus.boot.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderTest {
    @Test
    void name() {
        Gender[] values = Gender.values();
        Gender gender= values[0];
        System.out.println(gender);
    }
}