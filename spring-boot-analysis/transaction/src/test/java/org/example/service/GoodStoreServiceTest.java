package org.example.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GoodStoreServiceTest {
    @Autowired
    private GoodStoreService service;
    @Test
    void test1() throws InterruptedException {
        service.test();
        Thread.sleep(3000);
    }
}