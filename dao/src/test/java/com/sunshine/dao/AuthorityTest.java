package com.sunshine.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.sunshine.model.Module;
import com.sunshine.model.RoleModule;
import com.sunshine.util.ModuleTree;
import com.sunshine.util.ModuleTreeUtil;
import com.sunshine.util.UUIDUtil;

public class AuthorityTest extends InitTestCase {
	private RoleDao roleDao;
	private AuthorityDao authDao;
	private RoleAuthDao raDao;
	private ModuleDao moduleDao;
	private RoleModuleDao rmDao;
	
	@Before
	public void beforeTest() {
		roleDao = session.getMapper(RoleDao.class);
		authDao = session.getMapper(AuthorityDao.class);
		raDao = session.getMapper(RoleAuthDao.class);
		moduleDao = session.getMapper(ModuleDao.class);
		rmDao = session.getMapper(RoleModuleDao.class);
	}
	
	@Test
	public void testGetRole() {
		System.out.println(roleDao.getRole("1da6ec63-c610-4cd0-94c3-c6b068ca1411"));
	}
	
	@Test
	public void testAddModule() {
		Module module = new Module();
		module.setId(UUIDUtil.genericUUID());
		module.setName("入驻老人列表");
		module.setPid("6d41495a-b05c-415a-94d3-fa234c1f9dfa");
		moduleDao.saveModule(module);
	}
	
	@Test
	public void testAddRoleModule() {
		RoleModule rm = new RoleModule();
		rm.setId(UUIDUtil.genericUUID());
		rm.setRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411");
		rm.setModuleId("6d41495a-b05c-415a-94d3-fa234c1f9dfa");
		List<RoleModule> rms = new ArrayList<RoleModule>();
		rms.add(rm);
		rmDao.batchSaveRoleModule(rms);
	}
	@Test
	public void testBuildModuleTree() {
		List<Module> ms = rmDao.listModulesByRoleId("1da6ec63-c610-4cd0-94c3-c6b068ca1411");
		Set<Module> mset = new TreeSet<>(ms);
		Set<ModuleTree> mt = ModuleTreeUtil.buildModuleForest(mset);
		Iterator it = mt.iterator().next().getChildNodes().iterator();
		it.next();
		it.remove();
		Set<ModuleTree> mt1 = ModuleTreeUtil.buildModuleForest(mset);
		Iterator it1 = mt1.iterator().next().getChildNodes().iterator();
		it1.next();it1.next();
		it1.remove();
		System.out.println(mt);
		System.out.println(mt1);
		System.out.println(ModuleTreeUtil.mergeTree(mt, mt1));
	}
}
