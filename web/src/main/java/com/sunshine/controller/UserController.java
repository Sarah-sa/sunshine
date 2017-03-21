package com.sunshine.controller;
import java.util.List;
/**
 * 用户表的业务控制层，主要功能为用户登陆注册 增删改查
 * 
 * @author 云和数据-李颜
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	public String saveUser(User user){
		Integer a=UserService.saveUser(user);
		return "laryepage";
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
	 * 注释内容属于shiro权限登陆
	 */
	@RequestMapping("/login")
	@ResponseBody
	public String login(User user){
//		Subject su=SecurityUtils.getSubject();
//		UsernamePasswordToken token=new UsernamePasswordToken("userName","pwd");
//		token.setRememberMe(true);
//		try{
//		   su.login(token);
//		}catch(Exception e){
//			System.out.println("登录失败！");
//		} 
		System.out.println(user.getPwd());
		String b= UserService.login(user);
		if(b!=null){
		  return "登陆成功！";
		}
		  return "login";
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
	/**
	 * 所有用户数据分页
	 * @param pageindex
	 * @param pagesize
	 * @return
	 */
	@RequestMapping("/all")
	@ResponseBody
	public PageInfo all(Integer pageindex,Integer pagesize){
	 PageHelper.startPage(pageindex,pagesize);
	 List<User> list=UserService.all();
	 PageInfo<User> page= new PageInfo<User>(list);
		return page;
	}
	
}
