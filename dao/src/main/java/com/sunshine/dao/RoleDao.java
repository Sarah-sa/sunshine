package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Role;

/**
 * 权限表的 mapper 接口，主要功能为根据用户获取权限
 * 
 * @author 云和数据-王辉
 *
 */
public interface RoleDao {

	/**
	 * 根据 主键 获取 角色对象
	 * 
	 * @param id
	 *            角色主键
	 * @return 对应的角色对象
	 */
	Role getRole(String id);

	/**
	 * 获取系统中所有的可注册角色<br>
	 * 坐席管理人员是不可注册的，只有注册社区时才能注册坐席管理人员
	 * 
	 * @return 返回所有可注册角色
	 */
	List<Role> listAllRoles();

	/**
	 * 向数据库新增一条 角色数据
	 * 
	 * @param role
	 *            要插入数据库的角色信息
	 * @return 受影响的条数
	 */
	int saveRole(Role role);

	/**
	 * 根据角色名查询角色<br>
	 * 该方法主要用于新增 角色 时的查重
	 * 
	 * @param name
	 *            查询的角色名
	 * @return 是否已经存在同名角色：1-已经存在；0-不存在
	 */
	int countByName(String roleName);

	/**
	 * 更新角色信息
	 * 
	 * @param role
	 *            要跟新的信息
	 * @return 数据库中受影响的条数
	 */
	int updateRole(Role role);

	/**
	 * 删除一条角色信息
	 * 
	 * @param id
	 *            要删除的角色的 id
	 * @return 数据库中受影响的条数
	 */
	int removeRole(String id);

}
