package com.felixwc.mybatis.druid.mysql.service.impl;

import com.felixwc.mybatis.druid.mysql.mapper.UserDaoMapper;
import com.felixwc.mybatis.druid.mysql.pojo.User;
import com.felixwc.mybatis.druid.mysql.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/17 01:25
 *
 * @author wangchao
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserDaoMapper mapper;

    @Override
    public List<User> getAllUser() {
        return mapper.getAllUser();
    }
}
