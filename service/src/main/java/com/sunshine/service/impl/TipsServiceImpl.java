package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.TipsDao;
import com.sunshine.model.Tips;
import com.sunshine.service.TipsService;

@Service
public class TipsServiceImpl implements TipsService{

	@Autowired
	private TipsDao td;
	
	@Override
	public List<Tips> getTipsList(String tips_ctgy_id) {
		// TODO Auto-generated method stub
		return null;//td.getTipsList(tips_ctgy_id) ;
	}

	@Override
	public List<Tips> getLikeTips(String Titlename) {
		// TODO Auto-generated method stub
		return null;//td.getLikeTips(Titlename);
	}
	

}
