package com.sunshine.dao;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

/**
 * dao层测试类的通用初始化类<br>
 * 完成以下工作： ① 获取 Session<br>
 * ② 提交 Session<br>
 * ③ 关闭 Session<br>
 * 该层的测试类只需继承此类，便可方便的执行测试逻辑
 * 
 * @author 云和数据-王辉
 *
 */
public class InitTestCase {

	protected SqlSession session;

	/**
	 * 在 @Test 方法开始前，初始化 session
	 */
	@Before
	public void init() {
		try {
			SqlSessionFactory factory = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsReader("mybatis/mybatis-conf.xml"));
			session = factory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 在 @Test 方法结束后提交事务并关闭 session
	 */
	@After
	public void destroy() {
		if (session != null) {
			session.commit();
			session.close();
		}
	}
}
