package com.sunshine.dao;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class VolunteerTest extends InitTestCase {
@Test
public void testvteer(){
	Map<String, Object> map = new HashMap<>();
    map.put("address","上海");
    map.put("code", "10001");
	session.getMapper(VolunteerDao.class).listAllVolunteer(map);
	
}
}
