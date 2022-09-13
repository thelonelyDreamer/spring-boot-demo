package com.felixwc.controller.hello;

import com.felixwc.pojo.ResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/9/7 18:52
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/m1")
    private ResultVo getHello(){
        return ResultVo.success();
    }
}
