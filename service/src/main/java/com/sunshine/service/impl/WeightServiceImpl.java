package com.sunshine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.WeightDao;
import com.sunshine.model.Weight;
import com.sunshine.service.WeightService;

	/**
	 * @author 云和数据-孙爱平
	 *
	 */
	@Service
public class WeightServiceImpl implements WeightService {

	@Autowired
	private WeightDao weightDao;
	@Override
	public List<Weight> getWeight(Date sdate, Date edate) {
		
		return weightDao.getWeight(sdate, edate);
	}

}
