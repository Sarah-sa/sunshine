package com.sunshine.dao;

import org.junit.Test;

/**
 * 测试volunteeeractivityDao
 * @author 云和数据-齐铁成
 * 2017年3月16日
 */

public class VolunteeractivityDaoTest extends InitTestCase {
@Test
public void testVolactivity(){
	session.getMapper(VolunteerActivityDao.class).ListVolService();
}
	
	
	
}
