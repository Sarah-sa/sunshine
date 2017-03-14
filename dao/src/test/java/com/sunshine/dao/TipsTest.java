package com.sunshine.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

/**
 * 
 * @author 云和数据-齐铁成
 * 测试TipDao
 *
 */
public class TipsTest {

	private static Logger log = LogManager.getLogger(TipsTest.class);

	/**
	 * 
	 * @throws IOException
	 */
	 @Test
	 public void getTips() throws IOException{
	
	 String resource ="mybatis/mybatis-conf.xml";
	 InputStream inputStream = Resources.getResourceAsStream(resource);
	 SqlSessionFactory sqlSessionFactory = new
	 SqlSessionFactoryBuilder().build(inputStream);
	 SqlSession sqlSession=sqlSessionFactory.openSession();
	
	 TipsDao tsd=sqlSession.getMapper(TipsDao.class);
	 List list=tsd.getTipsList("1");
	 System.out.println(list);
	 }
	 
	 @Test
	 public void getLikeTips() throws IOException{
	
	 String resource ="mybatis/mybatis-conf.xml";
	 InputStream inputStream = Resources.getResourceAsStream(resource);
	 SqlSessionFactory sqlSessionFactory = new
	 SqlSessionFactoryBuilder().build(inputStream);
	 SqlSession sqlSession=sqlSessionFactory.openSession();
	
	 TipsDao tsd=sqlSession.getMapper(TipsDao.class);
	 List list=tsd.getLikeTips("健康");
	 System.out.println(list);
	
	 }
	
}
