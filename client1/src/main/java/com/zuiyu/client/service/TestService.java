package com.zuiyu.client.service;

import com.zuiyu.client.dao.UserDao;
import com.zuiyu.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * @author @醉鱼
 * @link https://github.com/TianPuJun
 * @ClassName TestService
 * @Description
 * @Date 20:58 2022/4/7
 **/
@Service
public class TestService {
    @Autowired
    private UserDao userDao;
    public void findAll(){
        Iterable<User> all = userDao.findAll();

        Iterator<User> iterator = userDao.findAll().iterator();
        User next1 = iterator.next();

        System.out.println(next1.toString());
    }
    public void save(){
        User user = new User();
        user.setId("1");
        user.setName("client1");
        user.setNamespace("elasticsearch:client1");
        user.setPhone("111");
        User save = userDao.save(user);
        System.out.println(save.toString());
    }
}
