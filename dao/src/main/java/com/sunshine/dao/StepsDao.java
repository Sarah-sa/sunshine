package com.sunshine.dao;

import java.util.Date;
import java.util.List;

import com.sunshine.model.Steps;

/**
 * 健康数据-计步数据接口dao层
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public interface StepsDao {

	/**
	 * 查找用户运动数据
	 * @param upload_date
	 * @return
	 */
	List<Steps> getSteps(Date stime,Date etime);
	/**
	 * 添加用户运动数据
	 * @param steps
	 * @return
	 */
	int saveSteps(Steps steps);
	/**
	 * 模糊查询用户运动数据
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
	 * 根据id删除用户运动数据
	 * @param id
	 * @return
	 */
	int removeSteps(String id);
}
