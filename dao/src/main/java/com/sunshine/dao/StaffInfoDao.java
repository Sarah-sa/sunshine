package com.sunshine.dao;

import java.util.List;

import com.sunshine.model.StaffInfo;

/**
 * 
 * @author 云和数据-齐铁成
 * 座席人员信息接口
 * 2017年3月7号
 */
public interface StaffInfoDao {
   /**
    * 获取所有注册的座席人员信息
    */
	List<StaffInfo> getListStaff();
	/**
	 *对单个座席人员进行修改
	 */
    int updateStaff(StaffInfo si);
	/**
	 * 根据id对单个座席人员进行删除
	 */
	int delStaff(String id);
	/**
	 * 新增座席人员及信息
	 */
	int saveStaff(StaffInfo si);
	
}
