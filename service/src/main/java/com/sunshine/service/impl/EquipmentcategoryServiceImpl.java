package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunshine.dao.EquipmentcategoryDao;
import com.sunshine.model.Equipmentcategory;
import com.sunshine.service.EquipmentcategoryService;
/**
 * 设备种类的业务实现
 * @author 陈晓锋
 *
 */
public class EquipmentcategoryServiceImpl implements EquipmentcategoryService{

	private static Logger logger = LogManager.getLogger(EquipmentcategoryServiceImpl.class);
	@Autowired
	private EquipmentcategoryDao equipmentcategoryDao;
	@Override
	public Equipmentcategory getEquipmentcategory(String id) {
		// TODO Auto-generated method stub
		return equipmentcategoryDao.getEquipmentcategory(id);
	}

	@Override
	public int saveEquipmentcategory(Equipmentcategory equipmentcategory) {
		// TODO Auto-generated method stub
		return equipmentcategoryDao.saveEquipmentcategory(equipmentcategory);
	}

	@Override
	public int removeEquipmentcategory(String id) {
		// TODO Auto-generated method stub
		return equipmentcategoryDao.removeEquipmentcategory(id);
	}

	@Override
	public int updateEquipmentcategory(Equipmentcategory equipmentcategory) {
		// TODO Auto-generated method stub
		return equipmentcategoryDao.updateEquipmentcategory(equipmentcategory);
	}

	@Override
	public List<Equipmentcategory> getAllEquipmentcategory() {
		// TODO Auto-generated method stub
		return equipmentcategoryDao.getAllEquipmentcategory();
	}



}
