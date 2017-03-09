package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.Role;
import com.sunshine.util.UUIDUtil;

/**
 * 测试 RoleDao 接口
 * 
 * @author 云和数据-王辉
 *
 */
public class RoleDaoTeset extends InitTestCase {

	public RoleDao getMapper() {
		return session.getMapper(RoleDao.class);
	}

	@Test
	public void testGet() {
		System.out.println(getMapper().getRole("1da6ec63-c610-4cd0-94c3-c6b068ca1411"));
	}

	@Test
	public void testSave() {
		Role role = new Role();
		role.setId(UUIDUtil.genericUUID());
		role.setRoleName("社区商家");
		session.getMapper(RoleDao.class).saveRole(role);
	}

	@Test
	public void testCount() {
		System.out.println(getMapper().countByName("社区商家1"));
	}

	@Test
	public void testList() {
		System.out.println(getMapper().listAllRoles());
	}
}
