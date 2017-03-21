package com.sunshine.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.VolunteerActivityDao;
import com.sunshine.model.Volunteeractivity;
import com.sunshine.service.VolunteerActivityService;

@Service
public class VolunteerActivityServiceImpl implements VolunteerActivityService{
@Autowired
private VolunteerActivityDao vad;

	@Override
	public List<Volunteeractivity> ListVolService() {
		// TODO Auto-generated method stub
		return vad.ListVolService();
	}

	@Override
	public List<Volunteeractivity> ListVolOnService() {
		// TODO Auto-generated method stub
		return vad.ListVolOnService();
	}

	@Override
	public List<Volunteeractivity> ListVolHistoryService() {
		// TODO Auto-generated method stub
		return vad.ListVolHistoryService();
	}

}
