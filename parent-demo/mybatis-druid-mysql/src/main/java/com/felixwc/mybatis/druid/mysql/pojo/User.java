package com.felixwc.mybatis.druid.mysql.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * in order to learn java!
 * created at 2021/8/17 00:42
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String address;
}
