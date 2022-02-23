package com.felixwc.springboot.security.controller.annotation;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * in order to learn java!
 * created at 2022/1/1 23:59
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/anno")
public class PrePostController {

    @GetMapping("/pre")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_root')")
    public String preMethod(@RequestParam("name") String name){
        return name;
    }
}
