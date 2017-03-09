package com.sunshine.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunshine.model.User;
import com.sunshine.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * 注入用户业务服务
	 */
	@Autowired
	private UserService UserService;

	/**
	 * 用户修改
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public String update(User user){
		UserService.updateUser(user);
		return "success";
	}

	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@RequestMapping("/saveUser")
	@ResponseBody
	public String saveUser(User user){
		Integer a=UserService.saveUser(user);
		return "success";
	}

	/**
	 * 用户删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/removeUser")
	@ResponseBody
	public String removeUser(String id){
		UserService.removeUser(id);
		return "success";
	}

	/**
	 * 用户登陆
	 * @param userName
	 * @param pwd
	 * @return
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(String userName,String pwd){
		String b= UserService.login(userName, pwd);
		return "success";
	}
	
	/**
	 * 用户查询
	 * @param id
	 * @return
	 */
	@RequestMapping("/getuser")
	@ResponseBody
	public String getuser(String id){
		UserService.getuser(id);
		return "success";
	}
	
	@RequestMapping("/get5")
	@ResponseBody
	public String see(){
		return "111";	
	}
}
