package com.sunshine.service.impl;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.UserDao;
import com.sunshine.model.User;
import com.sunshine.service.UserService;
import com.sunshine.util.UUIDUtil;
/**
 * 用户表服务层的接口实现类，主要功能为用户登陆注册 增删改查
 * 
 * @author 云和数据-李颜
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;


	/**
	 * 修改用户信息
	 */
	@Override
	public void updateUser(User user) {
		dao.updateUser(user);

	}

	/**
	 * 删除用户
	 */
	@Override
	public void removeUser(String id) {
		dao.removeUser(id);

	}

	/**
	 * 用户登陆
	 */
	@Override
	public String login(User user) {
//		System.out.println(user.getPwd());
//		System.out.println(user.getUserName());
//		String b = dao.login(user);
//		return b;
		return null;

	}

	/**
	 * 用户注册
	 */
	@Override
	public Integer saveUser(User user) {
		String uuid=UUIDUtil.genericUUID(); 
		user.setId(uuid);
		Integer a = dao.saveUser(user);
		return a;
	}

	/**
	 * 查询所有用户信息
	 */
	@Override
	public List<User> all() {
		//return dao.all();
		return null;
	}
	
	/**
	 * 用户查询
	 */
	@Override
	public User getuser(String id) {
		return dao.getuser(id);
	}

	@Override
	public <T> T currentUser() {
		Subject sub = SecurityUtils.getSubject();
		Object principal = sub.getPrincipal();
		if(principal == null)
			throw new UnauthenticatedException("用户未登录");
		
		return (T) principal;
	}

	

}
