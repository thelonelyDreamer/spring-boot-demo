package com.felixwc.mybatisplus.boot.pojo.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void test(){
        User user = new User();
        System.out.println(user.toString());
    }
}