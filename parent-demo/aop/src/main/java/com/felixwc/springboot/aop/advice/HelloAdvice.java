package com.felixwc.springboot.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * in order to learn java!
 * created at 2022/2/6 03:02
 *
 * @author wangchao
 */
@Component
@Aspect
public class HelloAdvice {
    private Logger logger = LoggerFactory.getLogger(HelloAdvice.class);

    @Pointcut(value = "execution(public * com.felixwc.springboot.aop.service.impl.*.*(..))" +
            "&& !execution(public * com.felixwc.springboot.aop.service.impl.AnnotationServiceImpl.*(..))")
    public void pointcut1() {
    }

    @Before(value = "pointcut1()")
    public void before(){
        System.out.println("before method");
    }
    @After("pointcut1()")
    public void after(){
        System.out.println("after method");
    }

    @AfterReturning("pointcut1()")
    public void afterReturning(){
        System.out.println("在返回后");
    }

    @AfterThrowing("pointcut1()")
    public void afterThrowing(){
        System.out.println("抛出异常后");
    }

    @Around("pointcut1()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("joinPoint 执行前");
        Object ret = joinPoint.proceed();
        System.out.println("joinPoint 执行后");
        return ret;
    }
}
