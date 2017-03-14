package com.sunshine.service;

import java.util.Date;
import java.util.List;

import com.sunshine.model.Steps;

/**
 * 
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public interface StepsService {
/**
 * 按时间查找用户运动数据
 * @param upload_date
 * @return
 */
	List<Steps> getByUpload_date(Date stime,Date etime);
	/**
	 * 保存运动数据
	 * @param steps
	 * @return
	 */
	int saveSteps(Steps steps);
	/**
	 * 模糊查询运动数据
	 * @return
	 */
	List<Steps> listAllSteps();
	/**
	 * 修改用户运动数据
	 * @param steps
	 * @return
	 */
	int updateSteps(Steps steps);
	/**
	 * 删除用户数据
	 * @param id
	 * @return
	 */
	int removeSteps(String id);
	
}
