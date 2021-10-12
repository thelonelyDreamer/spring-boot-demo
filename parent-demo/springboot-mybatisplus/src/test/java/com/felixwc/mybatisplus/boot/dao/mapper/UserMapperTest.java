package com.felixwc.mybatisplus.boot.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.felixwc.mybatisplus.boot.enums.Gender;
import com.felixwc.mybatisplus.boot.pojo.dao.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper mapper;
    @Test
    void test() {
        List<User> users = mapper.selectList(null);
        users.stream().forEach(System.out::println);
    }

    @Test
    void insertUser() {
        User user = new User().setName("si");
        int insert = mapper.insert(user);
        System.out.println(insert);
        System.out.println(user);
    }

    @Test
    void updateUsr() {
        User user = new User().setId(1L).setAge(20).setGender(Gender.FEMALE);
        mapper.updateById(user);
    }

    @Test
    public void queryWrapper() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("age",10,30);
        List<User> byAge = mapper.getByAge(queryWrapper);
        byAge.stream().forEach(System.out::println);
    }
    @Test
    public  void adderUser(){
        User user = new User().setName("sdff");

    }

    @Test
    public void getUserById(){
        User user = mapper.getById(1);
        System.out.println(user);
    }
}