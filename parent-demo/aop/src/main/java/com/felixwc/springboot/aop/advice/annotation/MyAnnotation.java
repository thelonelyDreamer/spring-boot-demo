package com.felixwc.springboot.aop.advice.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * in order to learn java!
 * created at 2022/2/7 03:18
 *
 * @author wangchao
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MyAnnotation {
    String value() default "annotation";
}
