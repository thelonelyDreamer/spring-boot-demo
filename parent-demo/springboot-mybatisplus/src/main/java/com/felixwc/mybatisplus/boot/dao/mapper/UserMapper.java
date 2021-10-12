package com.felixwc.mybatisplus.boot.dao.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.felixwc.mybatisplus.boot.pojo.dao.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/8/19 10:32
 *
 * @author wangchao
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    @Select("select name from user ${ew.customSqlSegment}")
    @Results(id = "test", value = {
            @Result(column = "id",property = "id"),
            @Result(column = "name", property = "name")
    })
    List<User> getByAge(@Param(Constants.WRAPPER) QueryWrapper queryWrapper);

    
    User getById(@Param("id") int id);
}
