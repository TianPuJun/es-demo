package com.zuiyu.client.controller;

import com.zuiyu.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author @醉鱼
 * @link https://github.com/TianPuJun
 * @ClassName TestController
 * @Description
 * @Date 21:27 2022/4/7
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("findAll")
    public void findAll(){
       testService.findAll();
    }
}
