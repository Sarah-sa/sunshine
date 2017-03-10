package com.sunshine.service.impl;

import java.util.Date;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.BloodSugarDao;
import com.sunshine.model.BloodSugar;
import com.sunshine.service.BloodSugarService;

/**
 * 血糖数据
 * 
 * @author 云和数据-边晓鹏
 *
 *         Administrator
 */
@Service
public class BloodSugarServiceImpl implements BloodSugarService {

	/**
	 * 日志记录
	 */
	private static Logger logger = (Logger) LogManager.getLogger(BloodPressureServiceImpl.class);
	@Autowired
	private BloodSugarDao bloodSugarDao;

	/**
	 * 根据时间范围查询用户数据
	 */
	@Override
	public List<BloodSugar> getByexamTime(Date stime, Date etime) {
		// TODO Auto-generated method stub
		logger.error("查询用户血压状况：" + stime + etime);
		return bloodSugarDao.getBloodSugar(stime, etime);
	}

	/**
	 * 添加用户血糖数据
	 */
	@Override
	public int saveBloodSugar(BloodSugar bloodSugar) {
		// TODO Auto-generated method stub
		int i = bloodSugarDao.saveBloodSugar(bloodSugar);
		if (i > 0) {
			System.out.println("添加一条记录");
		}
		return i;
	}

	/**
	 * 查询用户血糖数据
	 */
	@Override
	public List<BloodSugar> listAllBloodSugar() {
		// TODO Auto-generated method stub
		List<BloodSugar> bloodSugar = bloodSugarDao.listAllBloodSugar();
		return bloodSugar;
	}

	/**
	 * 修改用户血糖数据
	 */
	@Override
	public int updateBloodSugar(BloodSugar bloodSugar) {
		// TODO Auto-generated method stub
		int i = bloodSugarDao.updateBloodSugar(bloodSugar);
		if (i > 0) {
			System.out.println("修改一条记录");
		}
		return i;
	}

	/**
	 * 删除用户血糖数据
	 */
	@Override
	public int removeBloodSugar(String id) {
		// TODO Auto-generated method stub
		int i = bloodSugarDao.removeBloodSugar(id);
		if (i > 0) {
			System.out.println("删除一条记录");
		}
		return i;
	}

}
