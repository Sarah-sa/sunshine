package com.sunshine.util;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sunshine.dao.AuthorityDao;
import com.sunshine.model.Authority;

public class FilterChainDefinitionMapFactoryBean {

	@Autowired
	private AuthorityDao authDao;

	/**
	 * 创建权限验证规则
	 * 
	 * @return
	 */
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap() {
		//1. 从数据库中获取所有的权限信息
		List<Authority> ahths = authDao.listAll();
		
		//2. 创建一个LinkedHashMap<String, String> 类，用来初始化shiro验证器
		LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
		
		//3. 登陆页不需要验证
		filterChainDefinitionMap.put("/login.html", "anon");
		filterChainDefinitionMap.put("/menu/**", "anon");
//		filterChainDefinitionMap.put("/*", "anon");
//		filterChainDefinitionMap.put("/js/**", "anon");
//		filterChainDefinitionMap.put("/css/**", "anon");
//		filterChainDefinitionMap.put("/images/**", "anon");
//		filterChainDefinitionMap.put("/uicomponent/**", "anon");
//		filterChainDefinitionMap.put("/info/**", "authc");
		filterChainDefinitionMap.put("/**/*", "authc");
		//filterChainDefinitionMap.put("/loginsui.html", "anon");
		
		//4. 注册也不需要验证
		// TODO 添加注册也
		//filterChainDefinitionMap.put("", "anon");
		
		//5. 为超级管理员角色赋予超级权限
		filterChainDefinitionMap.put("/**", "roles[admimistrator]");
		
		//6. 遍历权限表，并将权限逐条添加到权限map里
		for (Authority authority : ahths) {
			filterChainDefinitionMap.put(authority.getUrl(), "perms[" + authority.getId() + "]");
		}
		// filterChainDefinitionMap.put("/**", "authc");
		
		//7. 返回权限验证规则表，用以初始化shiro
		return filterChainDefinitionMap;
	}
}
