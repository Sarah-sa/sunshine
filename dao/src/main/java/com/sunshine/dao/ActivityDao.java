package com.sunshine.dao;

import java.util.Date;
import java.util.List;

import com.sunshine.model.Activity;

/**
 * 文化生活-活动比赛表 t_activity数据接口
 * @author 云和数据-任继鹏
 * Administrator
 */
public interface ActivityDao {
	/**
	 * 查询历史活动
	 * @param activity
	 * @return
	 */
	
	public List<Activity> ListAllActivity(Date date);
	
	/**
	 * 查询当前活动
	 * @param activity
	 * @return
	 */
	public List<Activity> ListAllAti(Date date);
}
