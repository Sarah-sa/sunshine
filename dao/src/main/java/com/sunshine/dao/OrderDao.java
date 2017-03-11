package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.Order;

/**
 * 订单表操作
 * 
 * @author 云和数据-王辉
 *
 */
public interface OrderDao {
	Order getOrder(String id);
	Order getByCode(String code);
	List<Order> listUnFinishedOrderByUser();
	List<Order> listFinishedOrderByUser();
	List<Order> listOrderByUser();
}
