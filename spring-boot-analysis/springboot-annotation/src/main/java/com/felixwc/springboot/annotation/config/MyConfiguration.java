package com.felixwc.springboot.annotation.config;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * in order to learn java!
 * created at 2022/2/24 19:44
 *
 * @author wangchao
 */
@Configuration
public class MyConfiguration {

    @Bean
    public ConfigurationInner configurationInner(){
        ConfigurationInner configurationInner = new ConfigurationInner();
        return configurationInner;
    }

    @Data
    public static class ConfigurationInner{
        private String name;
    }
}
