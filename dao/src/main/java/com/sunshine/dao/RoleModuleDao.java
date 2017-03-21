package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Module;
import com.sunshine.model.RoleModule;

/**
 * 角色-菜单 映射表 mapper
 * 
 * @author 云和数据-王辉
 *
 */
public interface RoleModuleDao {
	/**
	 * 获取目录的数据库记录记录
	 * 
	 * @param id
	 *            目录在数据库中的 id
	 * @return 要查找的目录记录
	 */
	RoleModule getRoleModule(String id);

	/**
	 * 向数据库添加一条 角色-目录 记录(即向某角色添加一条目录权限)
	 * 
	 * @param roleModule
	 *            要添加的 角色-目录记录
	 * @return 数据库中受影响的记录条数
	 */
	int saveRoleModule(RoleModule roleModule);

	/**
	 * 删除指定 id 的数据库记录(即从某角色回收一条目录权限)
	 * 
	 * @param id
	 *            要删除的记录的 id
	 * @return 数据库中受影响的记录数
	 */
	int removeRoleModule(String id);

	/**
	 * 删除指定角色的所有目录权限
	 * @param roleId 指定的角色 id
	 * @return 数据库中受影响的记录数
	 */
	int removeAllModulesByRole(String roleId);
	
	/**
	 * 批量添加角色-目录记录(即批量授权)
	 * 
	 * @param roleModules
	 *            要添加的记录的集合
	 * @return 数据库中受影响的记录数
	 */
	int batchSaveRoleModule(List<RoleModule> roleModules);

	/**
	 * 批量删除角色-目录表的记录(即批量回收权限)
	 * 
	 * @param rmids
	 *            要删除的记录的集合
	 * @return 数据库中受影响的记录数
	 */
	int batchRemoveRoleModule(List<String> rmids);

	/**
	 * 根据角色获取目录权限
	 * 
	 * @param rid
	 *            角色 id
	 * @return 该角色所能获取到的目录
	 */
	List<Module> listModulesByRoleId(String rid);
}
