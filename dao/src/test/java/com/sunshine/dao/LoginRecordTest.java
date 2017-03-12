package com.sunshine.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
 
 

/**
 * 测试获取座席人员的登录记录
 * @author 云和数据-齐铁成
 * 2017年3月9号
 */
public class LoginRecordTest {
	private static Logger log = LogManager.getLogger(LoginRecordTest.class);
	@Test
     public void getLoginRecord() throws IOException{
    		 String resource ="mybatis/mybatis-conf.xml";
    		 InputStream inputStream = Resources.getResourceAsStream(resource);
    		 SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    		 SqlSession sqlSession=sqlSessionFactory.openSession();
    		 LoginRecordDao lr= sqlSession.getMapper(LoginRecordDao.class);
    		 List<Map<String, String>> list  = lr.getLoginRecord();
    		 log.info(list.size());
    	 
     }
	
	
	
	
}
