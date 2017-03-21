package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.ServerInfo;

public class ServerInfoDaoTest extends InitTestCase {
	ServerInfoDao getMapper() {
		return session.getMapper(ServerInfoDao.class);
	}
	
	@Test
	public void testGetByStatus() {
		System.out.println(getMapper().listServersByStatus(ServerInfo.ServerStatus.Check.toString()));
	}
}
