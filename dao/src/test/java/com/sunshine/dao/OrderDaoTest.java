package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.Order;

public class OrderDaoTest extends InitTestCase {
	@Test
	public void test() {
		OrderDao od = session.getMapper(OrderDao.class);
//		CriteriaOrder co = new CriteriaOrder();
//		co.setCode("");
//		co.setEarlestAcceptTime(new Date());
//		co.setEarliestCreateTime(new Date());
//		co.setLatestCreateTime(new Date());
//		od.listOrderByCriteria(co);
		od.listOrderByServer("1");
		od.saveOrder(new Order());
	}
}
