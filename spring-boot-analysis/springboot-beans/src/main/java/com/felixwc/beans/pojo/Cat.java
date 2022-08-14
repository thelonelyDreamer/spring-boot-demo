package com.felixwc.beans.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/4/8 14:23
 *
 * @author wangchao
 */
@Component
public class Cat implements FactoryBean<Cat>, DisposableBean, BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }


    @Override
    public Cat getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat.class;
    }

    @Override
    public void destroy() throws Exception {

    }
}
