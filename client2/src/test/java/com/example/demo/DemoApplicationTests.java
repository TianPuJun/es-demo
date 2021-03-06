package com.example.demo;

import com.example.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
public class DemoApplicationTests {


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
