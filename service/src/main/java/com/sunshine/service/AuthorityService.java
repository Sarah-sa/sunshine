package com.sunshine.service;

import java.util.Set;

import com.sunshine.model.Authority;
import com.sunshine.model.Role;
import com.sunshine.util.ModuleTree;

/**
 * 解析用户权限的业务接口
 * 
 * @author 云和数据-王辉
 *
 */
public interface AuthorityService {

	/**
	 * 获取指定用户的角色
	 * 
	 * @param uid
	 *            要获取角色的用户
	 * @return 用户所具有的角色
	 */
	Role parseRole(String uid);

	/**
	 * 获取用户所拥有的所有角色，包括直接继承和间接继承
	 * 
	 * @param uid
	 *            用户主键
	 * @return 用户所拥有的角色集合
	 */
	Set<Role> listRoles(String uid);

	/**
	 * 解析指定用户所具有的所有权限
	 * 
	 * @param user
	 *            查询权限的用户
	 * @return 该用户所具有的权限
	 */
	Set<Authority> parseAuthorities(String uid);

	/**
	 * 解析指定用户所具有的目录权限
	 * 
	 * @param user
	 *            要查询目录权限的用户
	 * @return 该用户所具有的目录权限
	 */
	Set<ModuleTree> parseModules(String uid);

	/**
	 * 为用户赋予角色
	 * 
	 * @param userId
	 *            用户主键
	 * @param roleId
	 *            角色主键
	 */
	void grantRoleToUser(String userId, String roleId);

	/**
	 * 解除指定用户的角色
	 * 
	 * @param userId
	 *            用户 id
	 * @param roleId
	 *            角色 id
	 */
	void revokeRoleFromUser(String userId, String roleId);

	/**
	 * 为角色批量授予权限
	 * 
	 * @param roleId
	 *            角色 id
	 * @param privIds
	 *            一组权限 id
	 * @return 是否授权成功
	 */
	boolean grantPriviledgesToRole(String roleId, String... privIds);

	/**
	 * 为角色授予目录权限
	 * 
	 * @param roleId
	 *            要授权的角色
	 * @param mdIds
	 *            要授予的目录权限
	 * @return
	 */
	boolean grantModulesToRole(String roleId, String... mdIds);

}
