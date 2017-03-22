package com.sunshine.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.sunshine.model.Order;
import com.sunshine.model.ServCategory;

/**
 * 订单操作类
 * @author 云和数据-王辉
 *
 */
public interface OrderService {
	
	/**
	 * 获取所有订单列表
	 * @param pageIndex 
	 * @param pageSize
	 * @return
	 */
	Page<Map<String, Object>> listOrderSummaryByServer(int pageIndex, int pageSize);
	
	/**
	 * 获取所有已经接单的订单
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	Page<Map<String, Object>> listAcceptOrderSummaryByServer(int pageIndex, int pageSize);
	
	/**
	 * 获取已完成的订单列表
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	Page<Map<String, Object>> listFinishedOrderSummaryByServer(int pageIndex, int pageSize);
	
	/**
	 * 获取未完成的订单
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	Page<Map<String, Object>> listUnFinishedOrderSummaryByServer(int pageIndex, int pageSize);
	
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
	
	/**
	 * 列出该服务项目下所有未完成的订单
	 * @param pageIndex
	 * @param pageSize
	 * @param itemId
	 * @return
	 */
	Page<Order> listUnHandledOrderSummaryByItemAndServer(int pageIndex, int pageSize, String itemId);
}
