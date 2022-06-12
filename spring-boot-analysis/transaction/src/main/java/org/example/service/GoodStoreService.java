package org.example.service;

import org.example.dao.GoodRepositoryDODAO;
import org.example.pojo.GoodRepositoryDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * in order to learn java!
 * created at 2022/6/5 16:41
 *
 * @author felixwc
 */
@Service
public class GoodStoreService {
    @Autowired
    private  GoodRepositoryDODAO dao;
    @Autowired
    @Lazy
    private GoodStoreService service;
    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = {Exception.class})
    public void test(){
        GoodRepositoryDO good = new GoodRepositoryDO();
        good.setGoodId(0L);
        good.setGoodStore(100);
        dao.save(good);
        service.test1();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = {Exception.class})
    public void test1(){
        GoodRepositoryDO good = new GoodRepositoryDO();
        good.setGoodId(1L);
        good.setGoodStore(100);
        dao.save(good);
        throw new NullPointerException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void test2(GoodRepositoryDO good){

    }
}
