package com.felixwc.beans.pojo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/4/8 14:23
 *
 * @author wangchao
 */
@Component
public class Cat implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        System.out.println("cat getObject");
        return new Cat();

    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }
}
