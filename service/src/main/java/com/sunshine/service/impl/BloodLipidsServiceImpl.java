package com.sunshine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.BloodLipidsDao;
import com.sunshine.model.BloodLipids;
import com.sunshine.service.BloodLipidsService;
	/**
	 * @author 云和数据-孙爱平
	 *
	 */
	@Service
public class BloodLipidsServiceImpl implements BloodLipidsService {
	@Autowired
	private BloodLipidsDao bloodLipidsDao;
	@Override
	public List<BloodLipids> getBloodLipids(Date sdate, Date edate) {

		return bloodLipidsDao.getBloodLipids(sdate, edate);
	}

}
