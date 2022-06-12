package org.example.dao;

import org.example.pojo.OrderDO;
import org.springframework.data.repository.CrudRepository;

/**
 * in order to learn java!
 * created at 2022/6/5 15:27
 *
 * @author felixwc
 */
public interface OrderDORepository extends CrudRepository<OrderDO,Long> {
}
