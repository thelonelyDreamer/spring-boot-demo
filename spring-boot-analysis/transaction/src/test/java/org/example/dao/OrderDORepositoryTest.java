package org.example.dao;

import org.example.pojo.OrderDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class OrderDORepositoryTest {
    @Autowired
    private OrderDORepository dao;

    @Test
    public void testDeleteById(){
        dao.delete(new OrderDO().setId(3L));
    }

    @Test
    public void findAllTest(){
        dao.findAll().forEach(System.out::println);
    }
}