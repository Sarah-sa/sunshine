package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.sunshine.model.ServCategory;
import com.sunshine.model.ServerInfo;
import com.sunshine.model.ServiceItem;
import com.sunshine.util.ServiceCategoryTree;

/**
 * 服务商相关业务
 * @author 云和数据-王辉
 *
 */
public interface ServerService {
	
	/**
	 * 完善/修改服务商信息
	 * @param info 供应商信息
	 * @return
	 */
	boolean improveServerInfo(ServerInfo info);
	
	/**
	 * 分页获取所有待审核供应商列表
	 * @param pageIndex 页码
	 * @param volume 每页容量
	 * @return 查询到的数据
	 */
	PageInfo<ServerInfo> listAllUnVerifiedServerByPage(int pageIndex, int pageSize);
	
	/**
	 * @param sid
	 * @param pageIndex
	 * @param volume
	 * @return
	 */
	PageInfo<Map<String, Object>> listServerItem(String sid, int pageIndex, int pageSize, boolean available);
	
	/**
	 * 获取所有服务分类
	 * @return
	 */
	List<ServiceCategoryTree> listServCategoryTree();
	
	/**
	 * 列出某种类的所有可用的服务项目
	 * @param cgyId 服务项目的类别
	 * @return 该类目下所有可用的服务
	 */
	List<Map<String, Object>> listAvailableItemByCgy(String cgyId);
	
	/**
	 * 添加服务条目
	 * @param item 服务条目
	 * @return
	 */
	boolean AddServiceItem(ServiceItem item);
	
	/**
	 * 通过 Item 的 主键获取 ServiceItem
	 * @param id
	 * @return
	 */
	ServiceItem getItem(String id);
	
	/**
	 * 根据 category id 获取 服务分类
	 * @param id
	 * @return
	 */
	ServCategory getCategory(String id);
	
	/**
	 * 通过id服务商信息
	 * @param id 服务商 id
	 * @return
	 */
	ServerInfo getServerInfo(String id);
}
