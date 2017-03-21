package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.Authority;
import com.sunshine.util.UUIDUtil;

public class AuthorityDaoTest extends InitTestCase {

	public AuthorityDao getMapper() {
		return session.getMapper(AuthorityDao.class);
	}
	
	@Test
	public void testSave() {
		Authority auth = new Authority();
		auth.setId(UUIDUtil.genericUUID());
		auth.setName("审核老人啦啦啦");
		auth.setUrl("/elder/checklalala");
		getMapper().saveAuthority(auth);
	}
	
	@Test
	public void testGet() {
		System.out.println(getMapper().getAuthority("cd4d5f2e-a51f-4218-a9cc-0aae88771dad"));
	}
}
