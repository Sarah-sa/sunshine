package com.sunshine.service;

import java.util.List;
import java.util.Map;

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
	
}
