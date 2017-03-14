package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.StaffInfoDao;
import com.sunshine.model.StaffInfo;
import com.sunshine.service.StaffInfoService;

/**
 *  座席服务层接口实现类
 *  @author 云和数据-齐铁成
 *  2017年3月8号
 */
@Service
public class StaffInfoServiceImpl implements StaffInfoService{
  @Autowired
  private StaffInfoDao sid=null;
	/**
	 * 获取所有的座席信息列表
	 */
	@Override
	public List<StaffInfo> getListStaff() {
		// TODO Auto-generated method stub
		return sid.getListStaff();
	}
	/**
	 * 修改座席信息 
	 */
	@Override
	public int updateStaff(StaffInfo si) {
		// TODO Auto-generated method stub
		return sid.updateStaff(si);
	}
	/**
	 * 删除座席信息
	 */
	@Override
	public int delStaff(String id) {
		// TODO Auto-generated method stub
		return sid.delStaff(id);
	}
	/**
	 * 添加座席信息
	 */
	@Override
	public int saveStaff(StaffInfo si) {
		// TODO Auto-generated method stub
		return sid.saveStaff(si);
	}
	  

}
