package com.sunshine.dao;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ExamineTest extends InitTestCase{
	@Test
	public void exmine(){
	Map<String,Object> map = new HashMap<>();
	map.put("idcard", "123456");
	map.put("elder_name", "456");
	map.put("phone", "321");
	session.getMapper(ExamineElderDao.class).listAllExamine(map);
	
	}
	

}
