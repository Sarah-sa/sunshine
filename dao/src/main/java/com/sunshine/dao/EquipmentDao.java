package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Equipment;

/**
 * 设备Dao数据接口
 * @author 陈晓锋
 *
 */
public interface EquipmentDao {

	/**
	 * 查询单个设备明细
	 * @param id
	 * @return
	 */
	Equipment getEquipment(String id);
	/**
	 * 添加设备
	 * @param equipment
	 */
	int saveEquipment(Equipment equipment);
	/**
	 * 删除设备
	 * @param id
	 */
	int removeEquipment(String id);
	/**
	 * 修改设备
	 * @param equipment
	 */
	int updateEquipment(Equipment equipment);
	/**
	 * 查询所有的设备列表
	 * @param 
	 * @return
	 */
	List<Equipment> getAllEquipment();

	
}
