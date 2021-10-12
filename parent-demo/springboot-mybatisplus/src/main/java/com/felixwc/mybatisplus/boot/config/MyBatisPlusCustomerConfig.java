package com.felixwc.mybatisplus.boot.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * in order to learn java!
 * created at 2021/8/19 11:09
 *
 * @author wangchao
 */
@Configuration
@MapperScan("com.felixwc.mybatisplus.boot.dao.mapper")
public class MyBatisPlusCustomerConfig {
    // 自定义主键生成器
    @Bean
    public IdentifierGenerator idGenerator() {
        return new IdentifierGenerator() {
            @Override
            public Number nextId(Object entity) {
                return null;
            }
        };
    }
}
