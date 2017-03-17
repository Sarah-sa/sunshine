package com.sunshine.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;

import com.sunshine.model.User;
import com.sunshine.util.UUIDUtil;




public class UserDaoTest extends InitTestCase {
	private static Logger log = (Logger) LogManager.getLogger();
	/**
	 * 
	 * @throws Exception
	 * 用户注册测试
	 */
	@Test
	public void saveUserTest() throws Exception{
		
		
		UserDao userDao = session.getMapper(UserDao.class);
		
		User user =new User();
		UUIDUtil uuid= new UUIDUtil();
		
		user.setId(uuid.genericUUID());	
		user.setUserName("G贪恋");
		user.setEmail("942186728@qq.com");
		user.setPhone("18037454085");
		user.setIdCard("411123199411151018");
		user.setPwd("1236");
		user.setRealName("李四");
		user.setRoleId("3");
		user.setCommunityId("4");

		userDao.saveUser(user);

		log.info("注册成功");
	
	}
	
	/**
	 *	修改用户信息
	 * @throws Exception
	 */
/*	@Test
	public void updateUserTest() throws Exception{
		
		UserDao userDao = session.getMapper(UserDao.class);
		// new UUIDUtil().genericUUID();
		User user =new User();
		user.setUserName("G贪....");
		user.setEmail("9421867@qq.com");
		user.setPhone("18037454080");
		user.setId("2");
		userDao.updateUser(user);
	
		
	}*/
	
	/**
	 * 删除用户
	 * @throws Exception
	 */
/*	@Test
	public void removeUserTest() throws Exception{
		
		UserDao userDao = session.getMapper(UserDao.class);
		// new UUIDUtil().genericUUID();
		User user =new User();
		userDao.removeUser("2");
		
		System.out.println("删除成功");
	}*/
	
	/**
	 * 根据用户ID查询用户信息
	 * @throws Exception
	 */
/*	@Test
	public void getuserTest() throws Exception{
		
		UserDao userDao = session.getMapper(UserDao.class);
		// new UUIDUtil().genericUUID();
		User user =new User();
		userDao.getuser("1");
		
		System.out.println("查询成功");
	}*/
	/**
	 * 根据用户名查询用户信息
	 * @throws Exception
	 */
/*	@Test
	public void getByUserNameTest() throws Exception{
		
		UserDao userDao = session.getMapper(UserDao.class);
		// new UUIDUtil().genericUUID();
		User user =new User();
		userDao.getByUserName("G贪恋你的美");
		
		System.out.println("查询成功");
	}
	*/
	
	
}
