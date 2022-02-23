package com.felixwc.springboot.aop.controller;

import com.felixwc.springboot.aop.service.AnnotationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/2/7 03:18
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/annotation")
public class AnnotationController {
    private final AnnotationService service;

    public AnnotationController(AnnotationService service) {
        this.service = service;
    }

    @GetMapping("/demo1")
    public String getDemo1(){
        service.annotationTest();
        return "demo";
    }
}
