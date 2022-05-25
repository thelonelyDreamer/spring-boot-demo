package com.felixwc.springboot.annotation.components;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/2/24 19:52
 *
 * @author wangchao
 */
@Component
public class MyComponent {

    @Bean
    public ComponentInner componentInner(){
        ComponentInner componentInner = new ComponentInner();
        componentInner.setName("componentInner");
        return componentInner;
    }
    @Data
    public class ComponentInner{
        private String name;
    }
}
