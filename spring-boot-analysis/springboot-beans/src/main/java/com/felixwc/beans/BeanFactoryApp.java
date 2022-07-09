package com.felixwc.beans;

import com.felixwc.beans.dependency.p1.A;
import com.felixwc.beans.dependency.p1.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * in order to learn java!
 * created at 2022/4/8 13:40
 *
 * @author wangchao
 */
@SpringBootApplication
public class BeanFactoryApp {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanFactoryApp.class, args);
        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        a.getB().hashCode();
        System.out.println(a.getB()==b);
    }
}
