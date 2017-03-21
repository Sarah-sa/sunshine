package com.sunshine.dao;

import com.sunshine.model.ServerInfo;

/**
 * 服务商详细信息的数据库操作接口
 * 
 * @author 云和数据-王辉
 *
 */
public interface ServerInfoDao {
	
	/**
	 * 根据主键查询ServerInfo记录
	 * @param id 要查询的记录的主键
	 * @return 对应的 ServerInfo记录
	 */
	ServerInfo getServerInfo(String id);
	
	/**
	 * 添加服务商详细信息
	 * @param info 服务商详细信息
	 * @return 数据库中受影响的记录数
	 */
	int saveServerInfo(ServerInfo info);
	
	/**
	 * 更新服务商详细信息
	 * @param info 服务商详细信息
	 * @return 数据库中受影响的记录数
	 */
	int updateServerInfo(ServerInfo info);
	
	/**
	 * 删除服务商详细信息
	 * @param id 要删除的服务商详细信息的主键
	 * @return 数据库中受影响的记录数
	 */
	int removeServerInfo(String id);
	
}
