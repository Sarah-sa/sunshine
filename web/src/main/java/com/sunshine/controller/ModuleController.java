package com.sunshine.controller;

import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunshine.message.Result;
import com.sunshine.model.Module;
import com.sunshine.service.AuthorityService;
import com.sunshine.util.EncryptUtil;
import com.sunshine.util.ModuleTree;

/**
 * 目录相关的
 * @author 云和数据-王辉
 *
 */
@Controller
@RequestMapping("/menu")
public class ModuleController {
	
	@Autowired
	private AuthorityService authService;
	
	@Autowired
	private EncryptUtil encUtil;
	
	/**
	 * 获取当前登陆用户的目录权限
	 * @return
	 */
	@RequestMapping("/menutree")
	@ResponseBody
	Result<Set<ModuleTree>> getMenuTree() {
		Result<Set<ModuleTree>> rs = new Result<>();
		
		Set<ModuleTree> set = authService.parseModules();
		if(set == null)
			rs.setRsCode(Result.RsCode.NotAuthenticated);
		else
			rs.setRsCode(Result.RsCode.Success);
		rs.setData(set);
		
		return rs;
	}
	
	/**
	 * 获取当前登陆用户的当前目录的子目录
	 * @param pid 当前目录id
	 * @return
	 */
	@RequestMapping("/menulist/{pid}")
	@ResponseBody
	Result<Set<Module>> getModule(@PathVariable("pid") String pid) {
		Set<Module> menus = authService.parseUserMenu(pid);
		Result<Set<Module>> rs = new Result<>();
		rs.setRsCode(Result.RsCode.Success);
		rs.setData(menus);
		return rs;
	}
	
	@RequestMapping("/menutree/{mid}")
	@ResponseBody
	Set<ModuleTree> getTree(@PathVariable("mid") String mid) {
		System.out.println(encUtil.encrypt("123456", "gtlndm"));
		return authService.parseModules(mid);
	}
	
	@RequestMapping("/menutree/login/{user}/{pass}")
	@ResponseBody
	String getTree(@PathVariable("user") String user, @PathVariable("pass") String pass) {
		Subject subject = SecurityUtils.getSubject();
		
		subject.login(new UsernamePasswordToken(user, pass));
		return "hhh";
	}
	
	@RequestMapping("/index/*")
	String index() {
		return "/WEB-INF/views/ftl/index";
	}
}
