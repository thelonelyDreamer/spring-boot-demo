package com.felixwc.mybatis.druid.mysql.mapper;

import com.felixwc.mybatis.druid.mysql.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/17 01:05
 *
 * @author wangchao
 */

@Mapper
@Repository
public interface UserDaoMapper {
    List<User> getAllUser();
}
