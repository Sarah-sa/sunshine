package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Equipmentrecord;
import com.sunshine.service.EquipmentrecordService;

/**
 * 设备使用记录控制层
 * @author 陈晓锋
 *
 */
@RestController
@RequestMapping("/Equipmentrecord")
public class EquipmentrecordController {

	@Autowired
	private EquipmentrecordService equipmentrecordService;
	/**
	 * 查询单个设备的使用记录
	 * @param id
	 * @return
	 */
	@RequestMapping("/get")
	public Equipmentrecord getEquipmentrecord(String id){
		return equipmentrecordService.getEquipmentrecord(id);
	}
	/**
	 * 添加设备的使用记录
	 * @param equipmentrecord
	 * @return
	 */
	@RequestMapping("/save")
	public int getEquipmentrecord(Equipmentrecord equipmentrecord){
		return equipmentrecordService.saveEquipmentrecord(equipmentrecord);
	}
	/**
	 * 删除设备的使用记录
	 * @param id
	 * @return
	 */
	@RequestMapping("remove")
	public int removeEquipmentrecord(String id){
		return equipmentrecordService.removeEquipmentrecord(id);
	}
	/**
	 * 修改设备的使用记录
	 * @param equipmentrecord
	 * @return
	 */
	@RequestMapping("/update")
	public int updateEquipmentrecord(Equipmentrecord equipmentrecord){
		return equipmentrecordService.updateEquipmentrecord(equipmentrecord);
	}
	/**
	 * 根据老人的ID查询匹配的设备的使用记录
	 * @param id
	 * @return
	 */
	@RequestMapping("/getAll")
	public List<Object> getContact(String id){
		return equipmentrecordService.getContact(id);
	}
}
