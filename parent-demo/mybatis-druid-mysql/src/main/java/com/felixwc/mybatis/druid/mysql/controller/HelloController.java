package com.felixwc.mybatis.druid.mysql.controller;

import com.felixwc.mybatis.druid.mysql.pojo.User;
import com.felixwc.mybatis.druid.mysql.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/17 00:44
 *
 * @author wangchao
 */
@RestController
public class HelloController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/hi")
    public String getHi(){
        return "hello";
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return userInfoService.getAllUser();
    }
}
