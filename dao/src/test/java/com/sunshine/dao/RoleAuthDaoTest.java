package com.sunshine.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sunshine.model.RoleAuth;
import com.sunshine.util.UUIDUtil;

public class RoleAuthDaoTest extends InitTestCase {
	
	private RoleDao roleDao;
	private AuthorityDao authDao;
	private RoleAuthDao raDao;
	@Before
	public void initDao() {
		roleDao = session.getMapper(RoleDao.class);
		authDao = session.getMapper(AuthorityDao.class);
		raDao = session.getMapper(RoleAuthDao.class);
	}
	
	@Test
	public void testSave() {
		RoleAuth ra = new RoleAuth();
		ra.setRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411");
		ra.setAuthId("153f8fd3-dc66-4aed-8bd2-0143d99c89fe");
		ra.setId(UUIDUtil.genericUUID());
		
		raDao.saveRoleAuth(ra);
	}
	
	@Test
	public void testGetRoleAuth() {
		System.out.println(raDao.getRoleAuth("2fb0b35a-e243-4965-aec9-1766720af666"));
	}
	
	@Test
	public void testRemoveRoleAuth() {
		System.out.println(raDao.removeRoleAuth("2fb0b35a-e243-4965-aec9-1766720af666"));
	}
	
	@Test
	public void testBatchSaveRoleAuth() {
		RoleAuth ra = new RoleAuth();
		ra.setRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411");
		ra.setAuthId("153f8fd3-dc66-4aed-8bd2-0143d99c89fe");
		ra.setId(UUIDUtil.genericUUID());
		RoleAuth ra1 = new RoleAuth();
		ra1.setRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411");
		ra1.setAuthId("cd4d5f2e-a51f-4218-a9cc-0aae88771dad");
		ra1.setId(UUIDUtil.genericUUID());
		List<RoleAuth> list = new ArrayList<>();
		list.add(ra1);
		list.add(ra);
		System.out.println(raDao.batchSaveRoleAuth(list));
	}
	
	@Test
	public void testBatchRemoveRoleAuth() {
		List<String> list = new ArrayList<>();
		list.add("888de427-a095-4aea-9a1c-7ad05186b5b0");
		System.out.println(raDao.batchRemoveRoleAuth(list));
	}
	
	@Test
	public void testListAuthorityByRoleId() {
		try {
			System.out.println(raDao.listAuthoritiesByRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
