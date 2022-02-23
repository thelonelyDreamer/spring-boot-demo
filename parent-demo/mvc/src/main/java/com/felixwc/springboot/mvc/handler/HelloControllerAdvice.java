package com.felixwc.springboot.mvc.handler;

import com.felixwc.springboot.mvc.exception.MyBasicException;
import com.felixwc.springboot.mvc.exception.MyExtendException1;
import com.felixwc.springboot.mvc.exception.MyExtendException2;
import org.springframework.web.bind.annotation.*;

/**
 * in order to learn java!
 * created at 2022/1/26 23:36
 *
 * @author wangchao
 */
@RestControllerAdvice
public class HelloControllerAdvice {

    //捕获特定异常
    @ExceptionHandler({NullPointerException.class})
    public ResponseState catchException2(Exception e){
        System.out.println(e.getClass().toString());
        return new ResponseState().setCode(601);
    }

    @ExceptionHandler({Exception.class})
    public ResponseState catchException1(Exception e){

        return new ResponseState().setCode(600);
    }

    @ExceptionHandler({MyBasicException.class})
    public ResponseState catchException3(Exception e){

        return new ResponseState().setCode(700);
    }

    @ExceptionHandler({MyExtendException1.class})
    public ResponseState catchException4(Exception e){

        return new ResponseState().setCode(701);
    }

    @ExceptionHandler({MyExtendException2.class})
    public ResponseState catchException5(Exception e){

        return new ResponseState().setCode(702);
    }
}
