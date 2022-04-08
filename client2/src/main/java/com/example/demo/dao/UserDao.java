package com.example.demo.dao;


import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author @醉鱼
 * @link https://github.com/TianPuJun
 * @ClassName UserDao
 * @Description
 * @Date 20:57 2022/4/7
 **/
@Repository
public interface UserDao extends CrudRepository<User,String> {
}
