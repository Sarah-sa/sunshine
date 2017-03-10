package com.sunshine.service;

import java.util.Date;
import java.util.List;

import com.sunshine.model.UricAcaid;

/**
	 * 
	 * @author 云和数据-孙爱平
	 *
	 */
public interface UricAcaidService {
	/**
	 * 根据时间查尿酸
	 * 
	 * @param sdate
	 * @param edate
	 * @return
	 */
	List<UricAcaid> getUricAcaid(Date sdate, Date edate);
		
		
}
