package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.ServiceItem;

/**
 * 服务条目的数据库操作
 * @author 云和数据-王辉
 *
 */
public interface ServiceItemDao {
	/**
	 * 根据id获取服务条目
	 * @param id 服务项目的id
	 * @return 对应的服务项目
	 */
	ServiceItem getItem(String id);
	
	/**
	 * 更新服务项目
	 * @param item 服务项目数据
	 * @return 数据库中受影响的记录数
	 */
	int updateItem(ServiceItem item);
	
	/**
	 * 新增一条服务项目
	 * @param item 服务项目的数据
	 * @return  数据库中受影响的记录数
	 */
	int saveItem(ServiceItem item);
	
	/**
	 * 删除一条服务项目
	 * @param id 要删除的服务项目的主键
	 * @return  数据库中受影响的记录数
	 */
	int removeItem(String id);
	
	/**
	 * 获取指定的服务商提供的所有服务项目
	 * @param sId 服务商的id
	 * @return 该服务商提供的所有服务项目
	 */
	List<Map<String, Object>> listItemByServer(String sId);
	
	/**
	 * 获取指定的服务商提供的所有可用的服务项目
	 * @param sid 服务商id
	 * @return 该服务商提供的所有可用的服务项目
	 */
	List<Map<String, Object>> listAvailableItemByServer(String sid);
	
	/**
	 * 获取指定的服务商提供的所有不可用的服务项目
	 * @param sid 服务商id
	 * @return 该服务商提供的所有不可用的服务项目
	 */
	List<Map<String, Object>> listUnavailableItemByServer(String sid);
	
	/**
	 * 列出某种类的所有可用的服务项目
	 * @param cgyId 服务项目的类别
	 * @return 该类目下所有可用的服务
	 */
	List<Map<String, Object>> listAvailableItemByCgy(String cgyId);
}
