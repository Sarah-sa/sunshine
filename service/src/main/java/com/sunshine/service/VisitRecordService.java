package com.sunshine.service;

import java.util.List;

import com.sunshine.model.VisitRecord;

/**
* 走访记录的业务接口
*@author 王一贺
* 2017年3月8日  
*/
public interface VisitRecordService {

	/**
	 *根据id获得对应的走访记录
	 * @param id 走访记录的id
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
	 * @param id 要删除的走访记录的id
	 * @return 数据库中受影响的行数
	 */
	int removeVisitRecord(String id);
}
