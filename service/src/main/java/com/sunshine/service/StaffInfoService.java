package com.sunshine.service;

import java.util.List;

import com.sunshine.model.StaffInfo;
/**
 *  座席服务层接口实现类
 *  @author 云和数据-齐铁成
 *  2017年3月8号
 */

public interface StaffInfoService {

		   /**
		    * 获取所有注册的座席人员信息
		    */
			List<StaffInfo> getListStaff();
			/**
			 *对单个座席人员进行修改
			 *@param si为座席信息对象
			 */
		    int updateStaff(StaffInfo si);
			/**
			 * 根据id对单个座席人员进行删除
			 */
			int delStaff(String id);
			/**
			 * 新增座席人员及信息
			 * @param si为座席信息对象
			 */
			int saveStaff(StaffInfo si);
		}

	
	
	
 
