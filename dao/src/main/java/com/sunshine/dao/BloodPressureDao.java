package com.sunshine.dao;



import java.util.Date;
import java.util.List;

import com.sunshine.model.BloodPressure;

/**
 * 
 * @author 云和数据-边晓鹏
 *健康数据-血压dao层
 * Administrator
 */

public interface BloodPressureDao {

	/**
	 * 根据时间范围查看用户血压表
	 * @param bloodpressure
	 * @return
	 */
	List<BloodPressure> getBloodPressure(Date stime,Date etime);
	/**
	 * 添加用户血压信息
	 * @param bloodPressure
	 * @return
	 */
	int saveBloodPressure(BloodPressure bloodPressure);
	/**
	 * 模糊查询用户血压信息
	 * @return
	 */
	List<BloodPressure> listAllBloodPressure();
	/**
	 * 修改血压信息
	 * @param bloodPressure
	 * @return
	 */
	int updateBloodPressure(BloodPressure bloodPressure);
	
	/**
	 * 删除血压信息
	 * @param id
	 * @return
	 */
	int removeBloodPressure(String id);
}
