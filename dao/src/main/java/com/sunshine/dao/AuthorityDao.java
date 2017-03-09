package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Authority;

/**
 * 权限表 mapper 类
 * 
 * @author 云和数据-王辉
 *
 */
public interface AuthorityDao {

	/**
	 * 根据权限 id 获取权限信息
	 * 
	 * @param id
	 *            权限 id
	 * @return 对应的权限
	 */
	Authority getAuthority(String id);

	/**
	 * 根据角色获取权限的集合
	 * 
	 * @param roleid
	 *            角色 id
	 * @return 角色所对应的权限集合
	 */
	List<Authority> listByRoleId(String roleid);

	/**
	 * 获取当前系统中所有的权限
	 * 
	 * @return 当前系统中的所有权限
	 */
	List<Authority> listAll();

	/**
	 * 添加一条权限
	 * 
	 * @param authority
	 *            权限数据
	 * @return 数据库中受影响的条数
	 */
	int saveAuthority(Authority authority);

	/**
	 * 更新一条权限信息
	 * 
	 * @param authority
	 *            待更新的权限信息
	 * @return 数据库中受影响的记录数
	 */
	int updateAuthority(Authority authority);

	/**
	 * 从数据库中删除指定的 权限信息
	 * 
	 * @param id
	 *            要删除的权限的 id
	 * @return 数据库中受影响的记录数
	 */
	int removeAuthority(String id);
}
