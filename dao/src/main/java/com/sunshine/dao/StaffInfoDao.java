package com.sunshine.dao;

import java.util.List;
import java.util.Map;
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
	/**
	 * 根据查询条件动态查询指定社区的座席人员信息
	 */
	List<Map<String, Object>> getLikeStaffInfo(Map<String, Object> map);
	/**
	 * 根据座席人员的id获取座席人员的信息
	 */
	List<Map<String, Object>> getStaff(String id);
	/**
	 * 获取所有的座席人员状态
	 */
	List getStatus();		
	/**
	 * 根据坐席人员id查询坐席人员信息 
	 * @param staffId 坐席人员 id
	 * @return 对应的坐席人员信息
	 */
	StaffInfo getStaffInfo(String staffId);
}
