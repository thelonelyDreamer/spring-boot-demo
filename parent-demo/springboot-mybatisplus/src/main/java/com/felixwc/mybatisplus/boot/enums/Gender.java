package com.felixwc.mybatisplus.boot.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum Gender{
    UNDEFINED(0,"undefined"),
    MALE(1,"male"),
    FEMALE(2,"female");
    @EnumValue
    private int code;
    private String description;

    Gender(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getValue() {
        return this.code;
    }
}
