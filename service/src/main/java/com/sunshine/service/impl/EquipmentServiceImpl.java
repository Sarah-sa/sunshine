package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.EquipmentDao;
import com.sunshine.model.Equipment;
import com.sunshine.service.EquipmentService;

/**
 * 设备的业务实现
 * @author 陈晓锋
 *
 */
@Service
public class EquipmentServiceImpl implements EquipmentService{

	private static Logger logger = LogManager.getLogger(EquipmentServiceImpl.class);
	
	@Autowired
	private EquipmentDao equipmentDao;
	
	@Override
	public Equipment getEquipment(String id) {
		// TODO Auto-generated method stub
		return equipmentDao.getEquipment(id);
	}

	@Override
	public int saveEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		logger.debug("添加成功："+equipment);
		
		return equipmentDao.saveEquipment(equipment);
	}

	@Override
	public int removeEquipment(String id) {
		// TODO Auto-generated method stub
        return equipmentDao.removeEquipment(id);
		
	}

	@Override
	public int updateEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		return equipmentDao.updateEquipment(equipment);
	}

	@Override
	public List<Equipment> getAllEquipment() {
		// TODO Auto-generated method stub
		return equipmentDao.getAllEquipment();
	}



}
