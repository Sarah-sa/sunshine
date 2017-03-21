package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.criteria.CriteriaOrderOperation;
import com.sunshine.model.OrderOperation;

/**
 * 坐席人员操作订单记录
 * 
 * @author 云和数据-王辉
 *
 */
public interface OrderOperationDao {
	
	/**
	 * 根据 id 获取操作记录
	 * @return 对应的操作记录
	 */
	Map<String, Object> getOperation(String id);
	
	/**
	 * 根据坐席人员Id获取操作记录
	 * @param sid 坐席人员ID
	 * @return 坐席人员对订单操作记录的集合
	 */
	List<Map<String, Object>> listByStaffId(String sid);
	
	/**
	 * 根据坐席人员 id 获取 坐席下单的记录
	 * @param sid 坐席人员 id
	 * @return 坐席人员下单记录的集合
	 */
	List<Map<String, Object>> listPlacedOrderByStaff(String sid);
	
	
	/**
	 * 根据坐席人员改派的订单
	 * @param sid 坐席人员id
	 * @return 订单操作泪飙
	 */
	List<Map<String, Object>> listChangedOrderByStaff(String sid);
	
	/**
	 * 新增一条订单操作记录
	 * @param operation 订单操作记录数据
	 * @return 数据库中受影响的记录数
	 */
	int saveOperation(OrderOperation operation);
	
	/**
	 * 获取所有坐席人员订单操作记录
	 * @return 订单操作记录集合
	 */
	List<Map<String, Object>> listAll();
	
	/**
	 * 获取指定订单被改派的记录
	 * @param oldId 改派前订单号
	 * @return 改派记录
	 */
	Map<String, Object> getByOldOrderId(String oldId);
	
	/**
	 * 订单操作记录的模糊查询
	 * @param criteria 模糊查询条件
	 * @return 模糊查询结果
	 */
	List<Map<String, Object>> listByCriteria(CriteriaOrderOperation criteria);
}
