package com.sunshine.service;


import java.util.Date;
import java.util.List;

import com.sunshine.model.Activity;

/**
* 通告活动的业务接口
*@author 任继鹏
* 2017年3月9日  
*/
public interface ActivityService {
	/**
	 * 根据当前时间模糊查询历史活动列表
	 * @param activity
	 * @return
	 */
	public List<Activity> ListAllActivity(Date date);
	/**
	 * 根据当前时间模糊查询当前活动列表
	 * @param activity
	 * @return
	 */
	public List<Activity> ListAllAti(Date date);
}
