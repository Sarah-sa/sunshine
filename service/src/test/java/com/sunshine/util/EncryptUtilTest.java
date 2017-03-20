package com.sunshine.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EncryptUtilTest {
	
	
	@Test
	public void testEncrypt() {
		EncryptUtil util = new EncryptUtil();
		System.out.println(util.encrypt("123456", "gnnm", "MD5", 100));
//		System.out.println(EncryptUtil.encrypt("123", "wanghui", "SHA1"));
		//91d8db7adce76454cad3396e68a1c47b
	}
	
}
