package com.sunshine.dao;

import org.junit.Before;
import org.junit.Test;

import com.sunshine.dao.ElderDao;
import com.sunshine.dao.ElderUserDao;
import com.sunshine.dao.UserDao;
import com.sunshine.model.ElderUser;
import com.sunshine.util.UUIDUtil;
import com.sunshine.dao.InitTestCase;

public class ElderUserDaoTest extends InitTestCase {
	
	private ElderDao elderDao;
	private UserDao userDao;
	private ElderUserDao euDao;

	@Before
	public void initDao() {
		elderDao = session.getMapper(ElderDao.class);
		userDao = session.getMapper(UserDao.class);
		euDao = session.getMapper(ElderUserDao.class);
	}

	/*@Test
	public void testList() {
		System.out.println(euDao.listAllRelatedElder("id"));
	}
*/
	@Test
	public void testSave() {

		ElderUser eu = new ElderUser();
		eu.setElder_id("9828c0e1-39b1-4c06-83fc-4270f2802f33");
		eu.setUser_id("1");
		eu.setId(UUIDUtil.genericUUID());

		euDao.saveElderUser(eu);
	}
/*
	@Test
	public void testGetElderUser() {
		System.out.println(euDao.getElderUser("id"));
	}

	@Test
	public void testRemoveElderUser() {
		System.out.println(euDao.removeElderUser("id"));
	}
*/
}
