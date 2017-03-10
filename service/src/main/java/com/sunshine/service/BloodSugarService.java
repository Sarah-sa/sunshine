package com.sunshine.service;

import java.util.Date;
import java.util.List;

import com.sunshine.model.BloodSugar;

/**
 * 健康数据-血糖表 t_blood_sugar 业务接口层
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public interface BloodSugarService {

	/**
	 * 根据时间查询用户血糖
	 * @param ByexamTime
	 * @return
	 */
	List<BloodSugar> getByexamTime(Date stime,Date etime);
	/**
	 * 添加用户血糖		
	 * @param bloodSugar
	 * @return
	 */
	int saveBloodSugar(BloodSugar bloodSugar);
	
	/**
	 * 模糊查询用户血糖
	 * @return
	 */
	List<BloodSugar> listAllBloodSugar();
	/**
	 * 修改血糖数据
	 * @param bloodSugar
	 * @return
	 */
	int updateBloodSugar(BloodSugar bloodSugar);
	/**
	 * 删除用户血糖数据
	 * @param id
	 * @return
	 */
	int removeBloodSugar(String id);
}
