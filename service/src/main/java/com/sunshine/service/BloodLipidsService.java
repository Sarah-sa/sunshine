package com.sunshine.service;

import java.util.Date;
import java.util.List;

import com.sunshine.model.BloodLipids;


public interface BloodLipidsService {
	/**
	 * 根据时间查血脂
	 * @param sdate
	 * @param edate
	 * @return
	 */
	List<BloodLipids> getBloodLipids(Date sdate, Date edate);
}