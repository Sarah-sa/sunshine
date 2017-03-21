package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.OrderStatus;

/**
 * 订单状态数据库操作接口
 * @author 云和数据-王辉
 *
 */
public interface OrderStatusDao {
	
	/**
	 * 新增一条订单状态数据
	 * @param status 订单状态
	 * @return 数据库中受影响的记录数
	 */
	int saveStatus(OrderStatus status);
	
	/**
	 * 更新一条订单状态数据
	 * @param status 订单状态
	 * @return 数据库中受影响的记录数
	 */
	int updateStatus(OrderStatus status);
	
	/**
	 * 删除一条订单状态数据
	 * @param id 状态id
	 * @return 数据库中受影响的记录数
	 */
	int removeStatus(String id);
	
	/**
	 * 根据状态id获取状态
	 * @param id 状态 id
	 * @return 对应的订单状态数据
	 */
	OrderStatus getStatus(String id);
	
	/**
	 * 获取所有订单状态数据
	 * @return 订单状态数据列表
	 */
	List<OrderStatus> listAll();
}
