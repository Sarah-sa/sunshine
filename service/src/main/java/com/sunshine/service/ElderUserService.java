package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.sunshine.model.ElderUser;
import com.sunshine.model.VisitRecord;

/**
 * 老人用户业务层
 * @author 云和数据-陈剑洲
 *
 */
public interface ElderUserService {
                

	/**
	 * 向数据库添加一条老人用户关系信息
	 * 
	 * @param relation
	 *            要插入数据库的信息
	 * @return 受影响的条数
	 */
	int saveElderUser(ElderUser elderUser);

	/**
	 * 更新老人用户信息
	 * 
	 * @param elder
	 *            要更新的信息
	 * @return 受影响的条数
	 * 
	 */
	int updateElderUser(ElderUser elderUser);

	/**
	 * 删除一条老人用户信息
	 * 
	 * @param id
	 *            要删除老人用户的id
	 * @return 受影响的条数
	 * 
	 */
	int removeElderUser(String id);

	/**
	 * 根据主键获取老人用户对象
	 * 
	 * @param id 老人用户主键
	 * @return 
	 * 
	 */
	ElderUser getElderUser(String id);

	/**
	 * 获取所有和指定用户有关联的老人
	 * 
	 * @param uid
	 *            指定的用户的id
	 * @return 返回所有的关联的老人的信息
	 * 
	 */
	List<Map<String, Object>> listAllRelatedElder(String uid);

	/**
	 * 获得所有的老人用户信息
	 * @return 老人用户的list集合
	 */
	List<ElderUser> listElderUser();

	

}

