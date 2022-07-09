package com.felixwc.beans.dependency.p1;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/7/2 01:13
 *
 * @author felixwc
 */
@Component
@Data
public class A {
    private B b;

    public A(@Lazy B b) {
        this.b = b;
    }
}
