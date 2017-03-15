package com.sunshine.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Equipment;
import com.sunshine.service.EquipmentService;

/**
 * 设备 控制层
 * @author 陈晓锋
 *
 */
@RestController
@RequestMapping("/Equipment")
public class EquipmentController {

	@Autowired
	private EquipmentService equipmentService;
	/**
	 * 查询设备
	 * @param id
	 * @return
	 */
	@RequestMapping("/get")
	public Equipment getEquipment(String id){
		Equipment equipment = equipmentService.getEquipment(id) ;
		return equipment;
	}
	/**
	 * 添加设备
	 * @param equipment
	 * @return
	 */
	@RequestMapping("/save")
	public int saveEquipment(Equipment equipment){
		
		return equipmentService.saveEquipment(equipment);
	}
	/**
	 * 删除设备
	 * @param id
	 * @return
	 */
	@RequestMapping("/remove")
	public int removeEquipment(String id){
		
		return equipmentService.removeEquipment(id);
	}
	/**
	 * 修改设备
	 * @param equipment
	 * @return
	 */
	@RequestMapping("/update")
	public int updateEquipment(Equipment equipment){
		
		return equipmentService.updateEquipment(equipment);
	}
	/**
	 * 查询所有设备
	 * @return
	 */
	@RequestMapping("/getAll")
	public List<Equipment> getAllEquipment(){
		return equipmentService.getAllEquipment();
	}
}
