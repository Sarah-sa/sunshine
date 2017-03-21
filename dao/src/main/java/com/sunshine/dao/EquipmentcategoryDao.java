package com.sunshine.dao;

import java.util.List;
import java.util.Map;

import com.sunshine.model.Equipmentcategory;
/**
 * 设备种类Dao接口
 * @author 陈晓锋
 *
 */
public interface EquipmentcategoryDao {

	/**
	 * 查询单个设备种类明细
	 * @param id
	 * @return
	 */
	Equipmentcategory getEquipmentcategory(String id);
	/**
	 * 添加设备种类
	 * @param equipmentcategory
	 */
	int saveEquipmentcategory(Equipmentcategory equipmentcategory);
	/**
	 * 删除设备种类
	 * @param id
	 */
	int removeEquipmentcategory(String id);
	/**
	 * 修改设备种类
	 * @param equipmentcategory
	 */
	int updateEquipmentcategory(Equipmentcategory equipmentcategory);
	/**
	 * 查询所有的设备种类列表
	 * @param 
	 * @return
	 */
	List<Equipmentcategory> getAllEquipmentcategory();

	
}
