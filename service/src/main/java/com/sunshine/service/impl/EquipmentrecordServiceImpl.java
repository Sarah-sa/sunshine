package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.EquipmentrecordDao;
import com.sunshine.model.Equipmentrecord;
import com.sunshine.service.EquipmentrecordService;
/**
 * 设备使用记录的实现类
 * @author 陈晓锋
 *
 */
@Service
public class EquipmentrecordServiceImpl implements EquipmentrecordService{

	private static Logger logger = LogManager.getLogger(EquipmentrecordServiceImpl.class);
	
	@Autowired
	private EquipmentrecordDao equipmentrecordDao;
	@Override
	public Equipmentrecord getEquipmentrecord(String id) {
		// TODO Auto-generated method stub
		return equipmentrecordDao.getEquipmentrecord(id);
	}

	@Override
	public int saveEquipmentrecord(Equipmentrecord equipmentrecord) {
		// TODO Auto-generated method stub
		return equipmentrecordDao.saveEquipmentrecord(equipmentrecord);
	}

	@Override
	public int removeEquipmentrecord(String id) {
		// TODO Auto-generated method stub
		return equipmentrecordDao.removeEquipmentrecord(id);
	}

	@Override
	public int updateEquipmentrecord(Equipmentrecord equipmentrecord) {
		// TODO Auto-generated method stub
		return equipmentrecordDao.updateEquipmentrecord(equipmentrecord);
	}

	@Override
	public List<Object> getContact(String id) {
		// TODO Auto-generated method stub
		return equipmentrecordDao.getContact(id);
	}



}
