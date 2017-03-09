package com.sunshine.service;

import java.util.Date;
import java.util.List;

import com.sunshine.model.Weight;
	/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public interface WeightService {
	/**
	 * 根据时间查体重
	 * 
	 * @param exam_time
	 * @return
	 */
	List<Weight> getWeight(Date sdate, Date edate);
}

