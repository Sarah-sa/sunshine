package com.sunshine.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.sunshine.model.ServiceItem;
import com.sunshine.util.UUIDUtil;

public class ServiceItemDaoTest extends InitTestCase {
	
	private ServiceItemDao getMapper() {
		return session.getMapper(ServiceItemDao.class);
	}
	
	@Test
	public void testGet() {
		System.out.println(session.getMapper(ServiceItemDao.class).getItem("1"));;
	}
	
	@Test
	public void testSave() {
		ServiceItem si = new ServiceItem();
		si.setId(UUIDUtil.genericUUID());
		si.setName("吃饭");
		si.setPrice(100);
		si.setServerid("02e00eb9-d60b-48ef-af22-9246da4a8cba");
		si.setSrvctgyid("sdafafa");
		si.setStatus(true);
		si.setDescription("木有");
		System.out.println(session.getMapper(ServiceItemDao.class).saveItem(si));
	}
	
	@Test
	public void testUpdate() {
		Logger log = LogManager.getLogger();
		ServiceItem si = getMapper().getItem("1a93c4ab-7fcb-45fd-a504-7fa9ac247294");
		si.setStatus(false);
		getMapper().updateItem(si);
	}
	@Test
	public void testRemove() {
		getMapper().removeItem("1");
	}
	
	@Test
	public void testListItemByServer() {
		System.out.println(getMapper().listItemByServer("02e00eb9-d60b-48ef-af22-9246da4a8cba"));
	}
	@Test
	public void testListAvailableItemByCgy() {
		System.out.println(getMapper().listAvailableItemByCgy("sdafafa"));
	}
	
	
}
