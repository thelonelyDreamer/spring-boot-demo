package com.felixwc.beans.pojo;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/7/1 18:31
 *
 * @author felixwc
 */
@Data
@Component
public class MyObject implements InitializingBean, DisposableBean {
//    private static String staticName;
    private String name;
    static{
        System.out.println("static in my_object");
    }

    {
        System.out.println("init in my_object");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
