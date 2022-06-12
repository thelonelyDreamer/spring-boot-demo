package org.example.service;

import org.example.dao.OrderDORepository;
import org.example.pojo.OrderDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * in order to learn java!
 * created at 2022/6/5 15:45
 *
 * @author felixwc
 */
@Service
public class OrderService {
    private OrderDORepository orderDao;

    @Autowired
    public OrderService(OrderDORepository orderDao) {
        this.orderDao = orderDao;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public OrderDO saveOneOrder(OrderDO orderDO){

        OrderDO saveOne = orderDao.save(orderDO);
        return saveOne;
    }
}
