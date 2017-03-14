package com.sunshine.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitApplicationContext {
	protected ConfigurableApplicationContext ctx;
	@Before
	public void initBeforeTest() {
		ctx = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
	}
	
	protected <T extends Class<T>> T getBean(T clazz) {
		return ctx.getBean(clazz);
	}
	
	@Test
	public void testMySelf() {
		
	}
	
	@After
	public void destroyAfterTest() {
		if(ctx != null) {
			ctx.close();
			ctx = null;
		}
	}
}
