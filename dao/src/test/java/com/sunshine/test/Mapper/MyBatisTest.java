package com.sunshine.test.Mapper;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.core.util.IOUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Wang YiHe 2017年3月7日
 */
public class MyBatisTest {

	SqlSessionFactory factory;

	@Before
	public void before() {
		try {
			factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis/mybatis-conf.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test() {

		factory.openSession();
	}

}
