package com.sunshine.dao;

import java.util.Date;
import java.util.List;

import com.sunshine.model.BloodSugar;

/**
 *  健康数据-血糖表 t_blood_sugar 数据接口层
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public interface BloodSugarDao {

	/**
	 * 根据时间查询用户血糖数据
	 * @param examTime
	 * @return
	 */
	List<BloodSugar> getBloodSugar(Date stime, Date etime);
/**
 * 添加血糖数据
 * @param bloodSugar
 * @return
 */
	int saveBloodSugar(BloodSugar bloodSugar);
	/**
	 * 模糊查询血糖数据
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
	 * 删除血糖数据
	 * @param id
	 * @return
	 */
	int removeBloodSugar(String id);
}
