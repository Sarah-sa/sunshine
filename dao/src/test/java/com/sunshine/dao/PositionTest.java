package com.sunshine.dao;

import org.junit.Before;
import org.junit.Test;

import com.sunshine.model.Position;

public class PositionTest extends InitTestCase{
	
	private PositionDao positionDao;
	 @Before
     public void BloodPressureDao() {
		 positionDao = session.getMapper(PositionDao.class);
     }
	

	@Test
	public void ceshi(){
		positionDao.getCurrentPositionByElder("22");
	System.out.println("0000000000000000000000000000000000000000000000");
	}
	
	
}
