package com.felixwc.controller.hello.hello;

import com.felixwc.pojo.ResultVo;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/9/14 16:39
 *
 * @author felixwc
 */
@Component
public class HelloController1 {
    public ResultVo hello(){
        return ResultVo.success();
    }
}
