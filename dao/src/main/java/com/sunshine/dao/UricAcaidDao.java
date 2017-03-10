package com.sunshine.dao;

import java.util.Date;
import java.util.List;

import com.sunshine.model.UricAcaid;
import com.sunshine.model.Weight;

/**
	 * 
	 * @author 孙爱平
	 *
	 */
public interface UricAcaidDao {
	/**
	 * 根据时间查尿酸
	 * 
	 * @param exam_time
	 * @return
	 */
	List<UricAcaid> getUricAcaid(Date sdate, Date edate);
}
