package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.OrderStatus;
import com.sunshine.util.UUIDUtil;

public class OrderStatusDaoTest extends InitTestCase {
	OrderStatusDao getMapper() {
		return session.getMapper(OrderStatusDao.class);
	}
	
	@Test
	public void testGet() {
		getMapper().getStatus(null);
	}
	
	@Test
	public void testSave() {
		OrderStatus os = new OrderStatus();
		os.setId(UUIDUtil.genericUUID());
		os.setName("name");
		getMapper().saveStatus(os);
	}
	
	@Test
	public void testUpdate() {
		OrderStatus os = getMapper().getStatus("9985a02b-3aa3-40d2-abb3-cfb781ee69df");
		os.setName("eman");
		getMapper().updateStatus(os);
	}
	
	@Test
	public void testRemove() {
		System.out.println(getMapper().removeStatus("9985a02b-3aa3-40d2-abb3-cfb781ee69df"));
	}
	
	@Test
	public void testListAll() {
		System.out.println(getMapper().listAll());
	}
}
