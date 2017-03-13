package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Equipmentrecord;
/**
 * 设备使用记录Dao接口
 * @author 陈晓锋
 *
 */
public interface EquipmentrecordDao {

	/**
	 * 查询单个设备使用记录明细
	 * @param id
	 * @return
	 */
	Equipmentrecord getEquipmentrecord(String id);
	/**
	 * 添加设备使用记录
	 * @param equipmentrecord
	 */
	int saveEquipmentrecord(Equipmentrecord equipmentrecord);
	/**
	 * 删除设备使用记录
	 * @param id
	 */
	int removeEquipmentrecord(String id);
	/**
	 * 修改设备使用记录
	 * @param equipmentrecord
	 */
	int updateEquipmentrecord(Equipmentrecord equipmentrecord);
	/**
	 * 根据老人id查询匹配的设备使用记录列表
	 * @param equipmentrecord
	 * @return
	 */
	List<Object> getContact(String id);

	
}
