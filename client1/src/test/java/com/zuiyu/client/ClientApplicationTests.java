package com.zuiyu.client;

import com.zuiyu.client.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientApplicationTests {

    @Autowired
    private TestService testService;
    @Test
    void contextLoads() {
    }

    @Test
    public void findAll(){
        testService.findAll();
    }
    @Test
    public void save(){
        testService.save();
    }
}
