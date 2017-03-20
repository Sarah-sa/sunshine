package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.sunshine.model.ServCategory;

/**
 * 订单操作类
 * @author 云和数据-王辉
 *
 */
public interface OrderService {
	
	/**
	 * 获取未处理订单列表
	 * @param pageIndex 
	 * @param pageSize
	 * @return
	 */
	List<Map<String, Object>> getOrderSummary(int pageIndex, int pageSize);
	
	/**
	 * 获取订单详情
	 * @param id 订单id
	 * @return
	 */
	Map<String, Object> getOrderDetail(String id);
	
	/**
	 * 获取一级服务分类
	 * @return 一级服务分类
	 */
	List<ServCategory> listRootCategory();
	
	/**
	 * 获取所有子分类
	 * @param pid 子分类
	 * @return
	 */
	List<ServCategory> listChildCategory(String pid);
}
