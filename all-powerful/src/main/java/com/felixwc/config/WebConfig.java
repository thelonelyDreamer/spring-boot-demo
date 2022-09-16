package com.felixwc.config;

import com.felixwc.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * in order to learn java!
 * created at 2022/9/9 01:41
 *
 * @author felixwc
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor);
    }
}
