package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Authority;
import com.sunshine.model.Role;
import com.sunshine.model.RoleAuth;

/**
 * 角色-权限 映射表 mapper
 * 
 * @author 云和数据-王辉
 *
 */
public interface RoleAuthDao {
	/**
	 * 根据 id 获取角色-权限映射类
	 * 
	 * @param id
	 *            映射类的 id
	 * @return 对应的 RoleAuth 对象
	 */
	RoleAuth getRoleAuth(String id);

	/**
	 * 添加一条 角色-权限 映射记录(即向某个角色添加某条权限)
	 * 
	 * @param roleAuth
	 *            要添加的映射
	 * @return 数据库中受影响的记录数
	 */
	int saveRoleAuth(RoleAuth roleAuth);

	/**
	 * 删除一条 角色-权限 映射记录(即从某个角色回收某条权限)
	 * 
	 * @param id
	 *            要删除的 角色-权限 映射的 id
	 * @return 数据库中受影响的记录数
	 */
	int removeRoleAuth(String id);

	/**
	 * 批量添加一批 角色-权限 映射记录(即批量向某些角色添加某些权限)
	 * 
	 * @param roleAuths
	 *            要添加的 角色-权限 映射记录
	 * @return 数据库中受影响的记录数
	 */
	int batchSaveRoleAuth(List<RoleAuth> roleAuths);

	/**
	 * 批量删除 角色-权限映射记录(即从某些角色中批量回收某些权限)
	 * 
	 * @param ids
	 *            要删除的 角色-权限 映射的 id的集合
	 * @return 数据库中受影响的记录数
	 */
	int batchRemoveRoleAuth(List<String> ids);
	
	/**
	 * 移除指定角色的所有权限
	 * @param roleId 角色id
	 * @return 数据库中受影响的记录数
	 */
	int removeAllAuthByRole(String roleId);

	/**
	 * 获取某角色的权限集合
	 * 
	 * @param rid
	 *            角色的 id
	 * @return 指定角色权限的集合
	 */
	List<Authority> listAuthoritiesByRoleId(String rid);

}
