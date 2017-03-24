package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
		PageHelper.startPage(1, 3, true);
		return sid.getListStaff();
	}
	/**
	 * 修改座席信息 
	 */
	@Override
	public int updateStaff(StaffInfo sf) {
		return sid.updateStaff(sf);
	}
	/**
	 * 删除座席信息
	 */
	@Override
	public int delStaff(String id) {
		return sid.delStaff(id);
	}
	/**
	 * 添加座席信息
	 */
	@Override
	public int saveStaff(StaffInfo si) {
		return sid.saveStaff(si);
	}
	 
	@Override
	public List<Map<String, Object>> getLikeStaffInfo(Map<String, Object> map) {
		return sid.getLikeStaffInfo(map);
	}
	@Override
	public List<Map<String, Object>> getStaff(String id) {
		return sid.getStaff(id);
	}
}
