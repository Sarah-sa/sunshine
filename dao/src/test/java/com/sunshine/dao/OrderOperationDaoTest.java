package com.sunshine.dao;

import java.util.Date;

import org.junit.Test;

import com.sunshine.criteria.CriteriaOrderOperation;
import com.sunshine.model.OrderOperation;
import com.sunshine.util.UUIDUtil;

public class OrderOperationDaoTest extends InitTestCase {
	
	OrderOperationDao getMapper() {
		return session.getMapper(OrderOperationDao.class);
	}
	
	@Test
	public void testGEt() {
		System.out.println(getMapper().getOperation("1"));
	}
	@Test
	public void testlistByStaffId(){
		OrderOperation oo = new OrderOperation();
		oo.setId(UUIDUtil.genericUUID());
		oo.setNeworderid("1");
		oo.setOldorderid("2");
		oo.setOperatetype(OrderOperation.OperaType.CHANGE);
		oo.setStaffid("2");
		System.out.println(getMapper().saveOperation(oo));
	}
	
	@Test
	public void testlistAll() {
		System.out.println(getMapper().getByOldOrderId("1"));
	}
	
	@Test
	public void listByCriteria() {
		CriteriaOrderOperation coo = new CriteriaOrderOperation();
		coo.seteDate(new Date());
		coo.setsDate(new Date());
		coo.setOperatetype(null);
		coo.setStaffId("1");
		System.out.println(getMapper().listByCriteria(coo));
	}
}
