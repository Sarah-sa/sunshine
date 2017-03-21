package com.sunshine.service;

import java.util.List;

import com.sunshine.model.Community;

/**
 * 社区模块业务类
 * @author 云和数据-王辉
 *
 */
public interface CommunityService {
	
	/**
	 * 根据社区id获取社区
	 * @param id 社区 id
	 * @return 对应的社区
	 */
	Community getCommunity(String id);
	
	/**
	 * 列出当前区域所有社区
	 * @param address 所选区域
	 * @return 社区列表
	 */
	List<Community> listLikeAddress(String address);
	
	/**
	 * 社区注册查重<br>
	 * @param name 社区名
	 * @param address 社区所在区域
	 * @return 是否有重复：true 重复 false 不重复
	 */
	boolean checkDuplicate(String name, String address);
	
	/**
	 * 社区注册
	 * @param community 要注册的社区
	 * @return 数据库中受影响的记录数
	 */
	boolean communityRegister(Community community);
	
	/**
	 * 更新社区信息
	 * @param community 社区信息
	 * @return 数据库中受影响的记录数
	 */
	boolean improveCommunityInfo(Community community);
	
	/**
	 * 根据行政区号获取社区，查重用
	 * @param adminCode
	 * @return
	 */
	boolean countByAdminCode(String adminCode);
	
	/**
	 * 删除社区信息
	 * @param id 社区 id
	 * @return 数据库中受影响的记录数
	 */
	boolean removeCommunity(String id);
	
	/**
	 * 获取所有未处理的社区入驻请求
	 * @return
	 */
	List<Community> listAllUnHandled();
	
	/**
	 * 当前用户所属社区
	 * @return
	 */
	Community currentCommunity();
}
