package com.sunshine.service;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitTestCaseInService {
	private ConfigurableApplicationContext ctx;
	
	@Before
	public void beforeTest() {
		ctx = new ClassPathXmlApplicationContext("classpath:/spring/spring.xml");
	}
	
	@After
	public void afterTest() {
		ctx.close();
	}
}
