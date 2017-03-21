package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.criteria.CriteriaOrder;
import com.sunshine.model.Order;

/**
 * 订单表操作
 * 对于订单表，暂不提供删除的方法
 * 
 * @author 云和数据-王辉
 *
 */
public interface OrderDao {
	
	/**
	 * 根据订单id获取订单内容
	 * @param id 订单号
	 * @return 订单记录
	 */
	Order getOrder(String id);
	/**
	 * 根据订单号获取订单内容
	 * @param code 订单号
	 * @return 订单记录
	 */
	Order getByCode(String code);
	
	/**
	 * 添加一条订单
	 * @param order 要添加的订单的数据
	 * @return 数据库中受影响的记录数
	 */
	int saveOrder(Order order);
	
	/**
	 * 更新订单信息
	 * @param order 要更新的内容
	 * @return 数据库中受影响的记录数
	 */
	int updateOrder(Order order);
	
	/**
	 * 列出所有指定用户所下的未完成的订单
	 * @param uid 用户id
	 * @return
	 */
	List<Order> listUnFinishedOrderByUser(String uid);
	
	/**
	 * 列出所有指定用户所下已完成的订单
	 * @param uid 用户id
	 * @return
	 */
	List<Order> listFinishedOrderByUser(String uid);
	
	/**
	 * @deprecated 此方法不推荐使用，因为sql 不支持对两条联合的查询结果分别进行排序
	 * 列出所有指定用户所下的订单
	 * @param uid 用户 id
	 * @return
	 */
	@Deprecated
	List<Order> listOrderByUser(String uid);
	
	/**
	 * 列出所有指定服务商所接到的未完成的订单
	 * @param serverId 服务商 id
	 * @return
	 */
	List<Order> listUnFinishedOrderByServer(String serverId);
	
	/**
	 * 列出所有指定服务商所接到的已完成的订单
	 * @param serverId 服务商 id
	 * @return
	 */
	List<Order> listFinishedOrderByServer(String serverId);
	
	/**
	 * @deprecated 此方法不推荐使用，因为 sql 语句不支持 对联合的两条sql查询分别排序
	 * 列出所有指定服务商所接到的所有订单
	 * @param serverId 服务商 id
	 * @return
	 */
	@Deprecated
	List<Order> listOrderByServer(String serverId);
	/**
	 * 对订单进行模糊查询
	 * @param criteriaOrder 模糊查询类
	 * @return 符合条件的订单
	 */
	List<Map<String, String>> listOrderByCriteria(CriteriaOrder criteriaOrder);
}
