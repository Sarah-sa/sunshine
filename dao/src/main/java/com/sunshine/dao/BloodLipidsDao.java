package com.sunshine.dao;

import java.util.Date;
import java.util.List;

import com.sunshine.model.BloodLipids;
	/**
	 * 
	 * @author 孙爱平
	 *
	 */
public interface BloodLipidsDao {

	/**
	 * 根据时间查血脂
	 * @param sdate
	 * @param edate
	 * @return
	 */
	List<BloodLipids> getBloodLipids(Date sdate, Date edate);
	
}
