package org.example.service;

import org.example.pojo.OrderDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OrderServiceTest {
    @Autowired
    private OrderService service;
    @Test
    public void testSaveOneOrder(){
        OrderDO orderDO = new OrderDO();
        orderDO.setId(1L);
        service.saveOneOrder(orderDO);
    }
}