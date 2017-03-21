package com.sunshine.dao;

import org.junit.Test;

public class CommunityDaoTest extends InitTestCase {
	CommunityDao getMapper() {
		return session.getMapper(CommunityDao.class);
	}
	
	@Test
	public void test() {
		System.out.println(getMapper().listLikeAddress("7"));
	}
}
