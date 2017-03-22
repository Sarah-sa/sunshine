package com.sunshine.service;
import java.util.List;

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
	 * @param id
	 */
	void removeUser(String id);

	/**
	 * 
	 * @param user
	 * @return
	 */
	String login(User user);
	
	/**
	 * 
	 * 查询所有用户信息
	 */
	List<User> all();

	/**
	 * 用户查询
	 * 
	 * @param id
	 * @return
	 */
	public User getuser(String id);

}
