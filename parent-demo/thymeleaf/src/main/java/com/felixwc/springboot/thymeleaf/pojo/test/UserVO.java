package com.felixwc.springboot.thymeleaf.pojo.test;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/11/9 12:55
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class UserVO {
    private long id;
    private String name;
    private String password;
}
