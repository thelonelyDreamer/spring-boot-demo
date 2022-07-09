package com.felixwc.beans.sets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * in order to learn java!
 * created at 2022/7/1 18:49
 *
 * @author felixwc
 */
@Component
public class MyComponent {
    private Component1 component1;
    private Component2 component2;

    public MyComponent() {
    }

    @Autowired
    public MyComponent(Component1 component1, Component2 component2) {
        this.component1 = component1;
        this.component2 = component2;
    }
}
