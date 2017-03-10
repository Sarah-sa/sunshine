package com.sunshine.service;
/**
 * 用户表的服务层接口，主要功能为用户登陆注册 增删改查
 * 
 * @author 云和数据-李颜
 *
 */
import com.sunshine.model.User;
public interface UserService {

	/**
	 * 用户注册信息
	 * @param user
	 * @return
	 */
	Integer saveUser(User user);


	/**
	 * 修改个人信息
	 * @param user
	 */
	void updateUser(User user);

	/**
	 * 删除用户
	 * @param id
	 */	 
	void  removeUser(String id);

	/**
	 * 用户登陆
	 * @param userName
	 * @param pwd
	 * @return
	 */
	 
	String login(String userName,String pwd);

	/**
	 * 用户查询
	 * @param id
	 * @return
	 */
	User getuser(String id);
}
