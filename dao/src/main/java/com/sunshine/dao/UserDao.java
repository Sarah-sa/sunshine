package com.sunshine.dao;

import com.sunshine.model.User;

public interface UserDao {
	
	/**
	 * 注册信息
	 * 
	 * @param user
	 * @return
	 */
	  Integer saveUser(User user);

	
	/**
	 * 修改个人信息
	 * 
	 * @param user
	 */
	 void updateUser(User user);
	
	
	/**
	 * 删除用户
	 * 
	 * @param user
	 */
	 void  removeUser(String id);
	 
	/**
	 * 用户登陆 
	 *
	 */
	String login(String userName,String pwd);
	
	/**
	 * 
	 * 用户查询
	 */
	public User getuser(String id);
	
	
	
	
}
