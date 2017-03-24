package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Complain;

/**
* 投诉模型的数据访问层
*@author 王一贺
* 2017年3月8日  
*/
public interface ComplainDao {
	
	/**
	 *描述：根据投诉的id获得该对象
	 *@author 王一贺 2017-03-08
	 *@param id 投诉的id
	 *@return 投诉对象
	 */
	Complain getComplain(String id);
	
	/**
	 *描述：获得所有的投诉对象构成list集合
	 *@author 王一贺 2017-03-08
	 *@return 投诉对象的集合
	 */
	List<Complain> listComplain();
	
	/**
	 *描述：增加投诉到数据库中
	 *@author 王一贺 2017-03-08
	 *@param complain 欲增加的投诉对象
	 *@return 受影响的行数
	 */
	int saveComplain(Complain complain);
	
	/**
	 *描述：更新投诉对象
	 *@author 王一贺 2017-03-08
	 *@param complain 准备更新的投诉对象
	 *@return 数据库中受影响的行数
	 */
	int updateComplain(Complain complain);
	
	/**
	 *描述：根据id删除对应的投诉对象
	 *@author 王一贺 2017-03-08
	 *@param id 准备删除的投诉对象的id
	 *@return 数据库中受影响的行数
	 */
	int removeComplain(String id);
	
	/**
	 *描述：根据查询条件map获得投诉表相关联的的投诉人、被投诉商家、处理人员等的相关字段信息
	 *@author 王一贺 2017-03-17
	 *@param map 封装查询条件<br/>可用的key值有--<b>id:</b>投诉的编号;<b>orderId:</b>被投诉的订单编号;
	 *<b>username:</b>投诉人的姓名;<b>status:</b>投诉已处理？1:0;
	 *<b>shopname:</b>被投诉的商家名称;<b>staffId:</b>处理该投诉的坐席人员编号;
	 *<b>startTime:</b>查询该时间点之后的投诉;<b>endTime:</b>查询该时间段之前的投诉;
	 *@return 满足查询条件的投诉信息集合
	 */
	List listComplainRelations(Map map);
}
