package com.sunshine.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.ElderDao;
import com.sunshine.dao.ElderUserDao;
import com.sunshine.model.ElderUser;
import com.sunshine.service.ElderUserService;

@Service("ElderUserService")
public class ElderUserServiceImpl implements ElderUserService {

	private static Logger logger = LogManager.getLogger(ElderUserServiceImpl.class);

	@Autowired
	private ElderUserDao elderUserDao;

	@Override
	public int saveElderUser(ElderUser elderUser) {
		logger.error("添加老人用户:" + elderUser);
		return elderUserDao.saveElderUser(elderUser);
	}

	@Override
	public int updateElderUser(ElderUser elderUser) {

		return elderUserDao.updateElderUser(elderUser);
	}

	@Override
	public int removeElderUser(String id) {

		return elderUserDao.removeElderUser(id);
	}

	@Override
	public ElderUser getElderUser(String id) {

		return elderUserDao.getElderUser(id);
	}

	@Override
	public List<Map<String, Object>> listAllRelatedElder(String uid) {

		return elderUserDao.listAllRelatedElder(uid);
	}

}
