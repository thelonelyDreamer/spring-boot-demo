package com.felixwc.springboot.aop.service.impl;

import com.felixwc.springboot.aop.advice.annotation.MyAnnotation;
import com.felixwc.springboot.aop.service.AnnotationService;
import org.springframework.stereotype.Service;

/**
 * in order to learn java!
 * created at 2022/2/7 03:20
 *
 * @author wangchao
 */
@Service
@MyAnnotation("annotation")
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String annotationTest() {
        return "annotation";
    }
}
