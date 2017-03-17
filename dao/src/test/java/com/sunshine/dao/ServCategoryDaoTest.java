package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.ServCategory;
import com.sunshine.util.UUIDUtil;

public class ServCategoryDaoTest extends InitTestCase {

	
	private ServCategoryDao getMapper() {
		return session.getMapper(ServCategoryDao.class);
	}
	
	@Test
	public void testGet() {
		System.out.println(getMapper().getCategory("1"));
	}
	
	@Test
	public void testlistAllCategory() {
		System.out.println(getMapper().listAllCategory());
	}
	
	@Test
	public void testSave() {
		ServCategory cate = new ServCategory();
		cate.setId(UUIDUtil.genericUUID());
		cate.setName("好吃");
		cate.setPid(cate.getId());
		System.out.println(getMapper().saveCategory(cate));
	}
	
	@Test
	public void testlistByPid() {
		System.out.println(getMapper().listByPid("05e7071c-25a6-47a8-9639-06c5a1d55e5d"));
	}
	
	@Test
	public void testlistAllRootCategory() {
		System.out.println(getMapper().listAllRootCategory());
	}
	
	@Test
	public void testupdateCategory() {
		ServCategory cate = getMapper().getCategory("05e7071c-25a6-47a8-9639-06c5a1d55e5d");
		cate.setName("hehe");
		getMapper().updateCategory(cate);
	}
	
	@Test
	public void testdeleteCategory() {
		System.out.println(getMapper().deleteCategory("111"));
	}
	
	@Test
	public void testremoveAllChildNode() {
		System.out.println(getMapper().removeAllChildNode("05e7071c-25a6-47a8-9639-06c5a1d55e5d"));
	}
	
	@Test
	public void testgetByNameAndPid() {
		System.out.println(getMapper().getByNameAndPid("你好", "sdafafa"));
	}
}
