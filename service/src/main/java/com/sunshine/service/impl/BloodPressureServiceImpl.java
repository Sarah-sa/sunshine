package com.sunshine.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.BloodPressureDao;
import com.sunshine.model.Advice;
import com.sunshine.model.BloodPressure;
import com.sunshine.service.BloodPressureService;

/**
 * 
 * @author 云和数据-边晓鹏 健康数据-血压serviceimpl层实现 Administrator
 */
@Service
public class BloodPressureServiceImpl implements BloodPressureService {

	/**
	 * 日志记录
	 */
	private static Logger logger = (Logger) LogManager.getLogger(BloodPressureServiceImpl.class);

	@Autowired
	private BloodPressureDao bloodPressureDao;

	/**
	 * 根据时间范围查询用户血压数据
	 */
	public List<BloodPressure> getBloodPressure(Date stime, Date etime) {
		// TODO Auto-generated method stub
		/**
		 * 日志记录
		 */
		logger.error("查询用户血压状况：" + stime + etime);

		return bloodPressureDao.getBloodPressure(stime, etime);
	}

	/**
	 * 添加用户血压数据
	 */
	@Override
	public int saveBloodPressure(BloodPressure bloodPressure) {
		// TODO Auto-generated method stub

		int i = bloodPressureDao.saveBloodPressure(bloodPressure);
		if (i > 1) {
			System.out.println("增加成功");
		}
		return i;
	}

	/**
	 * 查询用户血压数据
	 */
	@Override
	public List<BloodPressure> listAllBloodPressure() {
		// TODO Auto-generated method stub
		List<BloodPressure> listBloodPressur = bloodPressureDao.listAllBloodPressure();
		return listBloodPressur;
	}

	/**
	 * 修改用户血压数据
	 */
	@Override
	public int updateBloodPressure(BloodPressure bloodPressure) {
		// TODO Auto-generated method stub
		int i = bloodPressureDao.updateBloodPressure(bloodPressure);
		if (i > 1) {
			System.out.println("修改成功");
		}
		return i;
	}

	/**
	 * 删除用户血压数据
	 */
	@Override
	public int removeBloodPressure(String id) {
		// TODO Auto-generated method stub
		int i = bloodPressureDao.removeBloodPressure(id);
		return i;
	}

}
