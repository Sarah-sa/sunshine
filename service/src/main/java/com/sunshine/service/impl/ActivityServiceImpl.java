package com.sunshine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.ActivityDao;
import com.sunshine.model.Activity;
import com.sunshine.service.ActivityService;
/**
* 活动业务接口的实现类
*@author 任继鹏
* 2017年3月9日  
*/
@Service("ActivityService")
public class ActivityServiceImpl implements ActivityService {
/**
 * 自动注入ActivityDao接口
 */
	@Autowired
	private ActivityDao activitydao;
	@Override
	public List<Activity> ListAllActivity(Date date) {
		// TODO Auto-generated method stub
		return activitydao.ListAllActivity(date);
	}

	@Override
	public List<Activity> ListAllAti(Date date) {
		// TODO Auto-generated method stub
		return activitydao.ListAllAti(date);
	}

}
