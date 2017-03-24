package com.sunshine.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.sunshine.model.StaffInfo;

/**
 * 
 * @author 云和数据-齐铁成 测试有关座席人员的接口
 */

public class StaffInfoTest extends InitTestCase{
	private static Logger log = LogManager.getLogger(StaffInfoTest.class);

	/**
	 * 
	 * @throws IOException
	 */
	@Test
	public void getall(){
		System.out.println(session.getMapper(CommunityDao.class).getall());
		
	}
	
@Test
public void getAllInfo(){
  Map<String, Object> map =new HashMap<>();
//map.put("username","贪恋");   
//map.put("status","");
  map.put("gender", "1");
  map.put("communityId","1");
 //PageHelper.startPage(1,3);
 session.getMapper(StaffInfoDao.class).getLikeStaffInfo(map);
}

@Test
public void getStaffInfo(){
	session.getMapper(StaffInfoDao.class).getStaff("61d88662-c2cf-4b96-85b8-5103eb50baba");
}
	
	// @SuppressWarnings("static-access")
	// @Test
	// public void saveStaff() throws IOException{
	//
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	// StaffInfo staff=new StaffInfo();
	// staff.setAddress("郑州市");
	// staff.setBirthday(new Date());
	// staff.setGender(true);
	// staff.setNickName("nana");
	// staff.setPhoto("uhfshuipw");
	// staff.setTel("0371-123456");
	// UUIDUtil ud=new UUIDUtil();
	// staff.setUid(ud.genericUUID());
	// int i=staf.saveStaff(staff);
	// logger.info("添加成功");
	// System.out.println(i);
	//
	// sqlSession.commit();
	// sqlSession.close();
	// }
	/**
	 * 测试获取座席的集合
	 * 
	 * @throws IOException
	 */
	// @Test
	// public void getListStaff() throws IOException{
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	// List staffList=staf.getListStaff();
	// log.info(staffList);
	// }
	// /**
	// * 测试更改座席信息
	// * @throws IOException
	// */
	 @Test
	 public void updateStaff() throws IOException{
	 String resource ="mybatis/mybatis-conf.xml";
	 InputStream inputStream = Resources.getResourceAsStream(resource);
	 SqlSessionFactory sqlSessionFactory = new
	 SqlSessionFactoryBuilder().build(inputStream);
	 SqlSession sqlSession=sqlSessionFactory.openSession();
	
	 StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	
	 StaffInfo staff =new StaffInfo();
	 staff.setAddress("shanghai");
	 staff.setBirthday(new Date());
	 staff.setGender(true);
	 staff.setNickname("zizi");
	 staff.setPhoto("wsfrfew");
	 staff.setStatus(true);
	 staff.setTel("0394-458973");
	 staff.setUid("79842030-8f35-48eb-84f1-41c2de0b7e4c");
	 int s=staf.updateStaff(staff);
	 System.out.println(s);
	 log.info("更新成功");
	 sqlSession.commit();
	 sqlSession.close();
	
	 }

	// @Test
	// public void delStaff() throws IOException{
	// String resource ="mybatis/mybatis-conf.xml";
	// InputStream inputStream = Resources.getResourceAsStream(resource);
	// SqlSessionFactory sqlSessionFactory = new
	// SqlSessionFactoryBuilder().build(inputStream);
	// SqlSession sqlSession=sqlSessionFactory.openSession();
	//
	// StaffInfoDao staf=sqlSession.getMapper(StaffInfoDao.class);
	// int s=staf.delStaff("1");
	// System.out.println(s);
	// log.info("删除成功");
	// sqlSession.commit();
	// sqlSession.close();
	// }
	
	

}
