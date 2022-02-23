package com.felixwc.springboot.aop.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/2/7 03:24
 *
 * @author wangchao
 */
@Component
@Aspect
public class MyAnnotationAdvice {
    @Pointcut("@annotation(com.felixwc.springboot.aop.advice.annotation.MyAnnotation)")
    public void annotationPointCut(){

    }

    @Before(value = "annotationPointCut()")
    public void before(){
        System.out.println("before method");
    }
    @After("annotationPointCut()")
    public void after(){
        System.out.println("after method");
    }

}
