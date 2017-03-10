package com.sunshine.service;

import java.util.Date;
import java.util.List;

import com.sunshine.model.BloodPressure;
/**
 * 健康数据-血压
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public interface BloodPressureService {

	/**
	 * 根据时间范围查看用户血压表
	 * @param stime
	 * @param etime
	 * @return
	 */
	List<BloodPressure> getBloodPressure(Date stime, Date etime) ;
		/**
		 * 添加血压信息
		 * @param bloodPressure
		 * @return
		 */
	int saveBloodPressure(BloodPressure bloodPressure);
	/**
	 *  模糊查询血压信息
	 * @return
	 */
	List<BloodPressure> listAllBloodPressure();
	/**
	 * 修好用户血压信息
	 * @param bloodPressure
	 * @return
	 */
	int updateBloodPressure(BloodPressure bloodPressure);
	/**
	 * 删除用户血压信息
	 * @param id
	 * @return
	 */
	int removeBloodPressure(String id);
	
	
	
}
