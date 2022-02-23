package com.felixwc.springboot.JSR303.pojo.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * in order to learn java!
 * created at 2022/1/21 14:49
 *
 * @author wangchao
 */
@Data
public class HelloObject {
    @NotNull
    private String name;

    @Email
    private String email;
}
