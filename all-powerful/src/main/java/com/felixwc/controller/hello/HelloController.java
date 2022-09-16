package com.felixwc.controller.hello;

import com.felixwc.controller.hello.hello.HelloController1;
import com.felixwc.pojo.ResultVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * in order to learn java!
 * created at 2022/9/7 18:52
 *
 * @author felixwc
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    private HelloController1 helloController1;

    public HelloController(HelloController1 helloController1) {
        this.helloController1 = helloController1;
    }

    @RequestMapping("/m1")
    private ResultVo getHello(HttpServletRequest request){
        String mode = request.getHeader("mode");
        if(null==mode||mode.equalsIgnoreCase("")){
            return ResultVo.success();
        }else{
            return helloController1.hello();
        }
    }
}
