package com.sunshine.dao;

import org.junit.Test;

import com.sunshine.model.Module;
import com.sunshine.model.RoleModule;
import com.sunshine.util.UUIDUtil;

public class ModuleDaoTest extends InitTestCase {
	private ModuleDao getMapper() {
		return session.getMapper(ModuleDao.class);
	}
	
	private RoleModuleDao getRmMapper() {
		return session.getMapper(RoleModuleDao.class);
	}
	
	@Test
	public void testAddModuleToRole() {
		RoleModule rm = new RoleModule();
		rm.setId(UUIDUtil.genericUUID());
		rm.setModuleId("ee5cd130-8457-4123-9c21-36ef6d224630");
		rm.setRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411");
		getRmMapper().saveRoleModule(rm);
	}
	
	@Test
	public void testAdd() {
		
		Module module = new Module();
		module.setId(UUIDUtil.genericUUID());
		String pid = module.getId();
		module.setName("服务商中心");
		module.setPid(pid);
		
		Module module1 = new Module();
		module1.setId(UUIDUtil.genericUUID());
		module1.setName("订单处理");
		module1.setPid(pid);
		
		Module module5 = new Module();
		module5.setId(UUIDUtil.genericUUID());
		module5.setName("投诉查看");
		module5.setPid(pid);
		
		Module module6 = new Module();
		module6.setId(UUIDUtil.genericUUID());
		module6.setName("服务管理");
		module6.setPid(pid);
		
		Module module61 = new Module();
		module61.setId(UUIDUtil.genericUUID());
		module61.setName("服务列表");
		module61.setPid(module6.getId());
		
		Module module62 = new Module();
		module62.setId(UUIDUtil.genericUUID());
		module62.setName("新增服务");
		module62.setPid(module6.getId());
		
		Module module2 = new Module();
		module2.setId(UUIDUtil.genericUUID());
		module2.setName("未处理订单");
		module2.setPid(module1.getId());
		
		Module module3 = new Module();
		module3.setId(UUIDUtil.genericUUID());
		module3.setName("未完成订单");
		module3.setPid(module1.getId());
		
		Module module4 = new Module();
		module4.setId(UUIDUtil.genericUUID());
		module4.setName("已完成订单");
		module4.setPid(module1.getId());
		
		getMapper().saveModule(module);
		getMapper().saveModule(module1);
		getMapper().saveModule(module5);
		getMapper().saveModule(module6);
		getMapper().saveModule(module61);
		getMapper().saveModule(module62);
		getMapper().saveModule(module2);
		getMapper().saveModule(module3);
		getMapper().saveModule(module4);
		
	}
}
