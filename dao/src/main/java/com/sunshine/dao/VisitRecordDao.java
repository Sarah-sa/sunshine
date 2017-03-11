package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.VisitRecord;

/**
 * 走访记录模型的数据访问接口 
 * @author 王一贺 2017年3月7日
 */
public interface VisitRecordDao {

	/**
	 * 根据id获得对应的走访记录
	 * @param id  走访记录的id
	 * @return 走访记录
	 */
	VisitRecord getVisitRecord(String id);

	/**
	 * 获得所有的走访记录
	 * @return 走访记录的list集合
	 */
	List<VisitRecord> listVisitRecord();

	/**
	 * 插入 走访记录 到数据库
	 * @param vr 走访记录对象
	 * @return 数据库中受影响的行数
	 */
	int saveVisitRecord(VisitRecord vr);

	/**
	 * 更新 走访记录
	 * @param vr 走访记录对象
	 * @return 数据库中受影响的行数
	 */
	int updateVisitRecord(VisitRecord vr);

	/**
	 * 删除 走访记录
	 * @param id  要删除的走访记录的id
	 * @return 数据库中受影响的行数
	 */
	int removeVisitRecord(String id);
	
	/**
	 *描述：从视图v_visit_elder_staff中查询走访记录
	 *@author 王一贺 2017-03-10
	 *@param map 封装查询条件<br/>可用的key有：<b>id：</b>走访记录的编号；<b>name：</b>老人的姓名；
	 *<b>status：</b>走访计划实施没？1:0；<b>startTime</b>、<b>endTime：</b>在一定时间段内的走访执行记录
	 *@return 走访记录表、老人表、坐席表中相关联的字段
	 */
	List<Map<String,Object>> listVisitElderStaff(Map map);
}
