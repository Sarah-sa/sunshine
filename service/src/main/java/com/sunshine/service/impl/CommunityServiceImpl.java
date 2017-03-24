package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.CommunityDao;
import com.sunshine.model.Community;
import com.sunshine.service.CommunityService;
@Service
public class CommunityServiceImpl implements CommunityService {
@Autowired
private CommunityDao cd;
	@Override
	public List<Community> getall() { 
		return cd.getall();
	}
}
