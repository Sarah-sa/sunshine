package com.sunshine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Equipmentcategory;
import com.sunshine.service.EquipmentcategoryService;

/**
 * 设备种类控制层
 * @author 陈晓锋
 *
 */
@RestController
@RequestMapping("/Equipmentcategory")
public class EquipmentcategoryController {

	@Autowired
	private EquipmentcategoryService equipmentcategoryService;
	/**
	 * 查询单个设备种类
	 * @param id
	 * @return
	 */
	@RequestMapping("/get")
	public Equipmentcategory getEquipmentcategory(String id){
		return equipmentcategoryService.getEquipmentcategory(id);
	}
	/**
	 * 添加设备种类
	 * @param equipmentcategory
	 * @return
	 */
	@RequestMapping("/save")
	public int saveEquipmentcategory(Equipmentcategory equipmentcategory){
		return equipmentcategoryService.saveEquipmentcategory(equipmentcategory);
	}
	/**
	 * 删除设备种类
	 * @param id
	 * @return
	 */
	@RequestMapping("/remove")
	public int removeEquipmentcategory(String id){
		return equipmentcategoryService.removeEquipmentcategory(id);
	}
	/**
	 * 修改设备种类
	 * @param equipmentcategory
	 * @return
	 */
	@RequestMapping("/update")
	public int updateEquipmentcategory(Equipmentcategory equipmentcategory){
		return equipmentcategoryService.updateEquipmentcategory(equipmentcategory);
	}
	/**
	 * 查询所有设备种类
	 * @return
	 */
	@RequestMapping("/getAll")
	public List<Equipmentcategory> getAllEquipmentcategory(){
		return equipmentcategoryService.getAllEquipmentcategory();
	}
}
