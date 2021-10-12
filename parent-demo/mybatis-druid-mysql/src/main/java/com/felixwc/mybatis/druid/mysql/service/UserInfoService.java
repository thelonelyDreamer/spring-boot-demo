package com.felixwc.mybatis.druid.mysql.service;

import com.felixwc.mybatis.druid.mysql.pojo.User;

import java.util.List;

public interface UserInfoService {
    List<User> getAllUser();
}
