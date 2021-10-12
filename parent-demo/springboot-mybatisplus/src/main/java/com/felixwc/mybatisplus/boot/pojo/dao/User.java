package com.felixwc.mybatisplus.boot.pojo.dao;

import com.baomidou.mybatisplus.annotation.*;
import com.felixwc.mybatisplus.boot.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/8/19 10:28
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "user")
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    private Dog dog;

    @TableLogic(value = "0",delval = "1")
    @TableField("logic_del")
    private Integer deleted;
    @Version
    private Integer  version;
    private Gender gender;
}
