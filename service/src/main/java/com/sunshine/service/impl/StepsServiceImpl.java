package com.sunshine.service.impl;

import java.util.Date;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.StepsDao;
import com.sunshine.model.Steps;
import com.sunshine.service.StepsService;

/**
 * 用户运动数据
 * 
 * @author 云和数据-边晓鹏
 *
 *         Administrator
 */
@Service
public class StepsServiceImpl implements StepsService {

	/**
	 * 日志
	 */
	private static Logger logger = (Logger) LogManager.getLogger(BloodPressureServiceImpl.class);

	@Autowired
	private StepsDao stepsDao;

	/**
	 * 按日期查看用户运动数据
	 */
	@Override
	public List<Steps> getByUpload_date(Date stime, Date etime) {
		// TODO Auto-generated method stub
		logger.error("查询用户血压状况：" + stime, etime);
		return stepsDao.getSteps(stime, etime);
	}

	/**
	 * 添加用户运动数据
	 */
	@Override
	public int saveSteps(Steps steps) {
		// TODO Auto-generated method stub
		int i = stepsDao.saveSteps(steps);
		if (i > 0) {
			System.out.println("增加了一条记录");
		}
		return i;
	}

	/**
	 * 查询用户运动数据
	 */
	@Override
	public List<Steps> listAllSteps() {
		// TODO Auto-generated method stub
		List<Steps> steps = stepsDao.listAllSteps();
		return steps;
	}

	/**
	 * ( 修改用户运动数据
	 */
	@Override
	public int updateSteps(Steps steps) {
		// TODO Auto-generated method stub
		int i = stepsDao.updateSteps(steps);
		if (i > 0) {
			System.out.println("修改了一条记录");
		}
		return i;
	}

	/**
	 * 删除用户运动数据
	 */
	@Override
	public int removeSteps(String id) {
		// TODO Auto-generated method stub
		int i = stepsDao.removeSteps(id);
		if (i > 0) {
			System.out.println("删除了一条记录");
		}
		return i;
	}

}
