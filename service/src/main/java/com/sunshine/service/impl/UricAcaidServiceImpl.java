package com.sunshine.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.UricAcaidDao;
import com.sunshine.model.UricAcaid;
import com.sunshine.service.UricAcaidService;
	@Service
public class UricAcaidServiceImpl implements UricAcaidService {
	@Autowired
	private UricAcaidDao uricAcaidDao;
	@Override
	public List<UricAcaid> getUricAcaid(Date sdate, Date edate) {
		
		return uricAcaidDao.getUricAcaid(sdate, edate);
	}

}
