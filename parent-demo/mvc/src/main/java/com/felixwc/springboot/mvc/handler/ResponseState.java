package com.felixwc.springboot.mvc.handler;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2022/1/26 23:37
 *
 * @author wangchao
 */
@Data
@Accessors(chain = true)
public class ResponseState {
     private String message; // 返回具体信息
     private int code; // 返回具体状态吗
}
