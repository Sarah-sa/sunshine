package com.sunshine.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.AuthorityDao;
import com.sunshine.dao.RoleAuthDao;
import com.sunshine.dao.RoleDao;
import com.sunshine.dao.RoleModuleDao;
import com.sunshine.dao.UserDao;
import com.sunshine.model.Authority;
import com.sunshine.model.Module;
import com.sunshine.model.Role;
import com.sunshine.model.RoleAuth;
import com.sunshine.model.User;
import com.sunshine.service.AuthorityService;
import com.sunshine.util.ModuleTree;
import com.sunshine.util.ModuleTreeUtil;

/**
 * AuthorityService 实现类
 * 
 * @author 云和数据-王辉
 *
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private AuthorityDao authorityDao;

	@Autowired
	private RoleModuleDao roleModuleDao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleAuthDao roleAuthDao;

	@Override
	public Role parseRole(String uid) {
		User user = userDao.getuser(uid);
		if (user != null && user.getRoleId() != null)
			return roleDao.getRole(user.getRoleId());
		else
			return null;
	}

	@Override
	public Set<Authority> parseAuthorities(String uid) {

		// 1. 获取当前用户所属的角色
		Role role = parseRole(uid);

		// 2. 创建权限的集合
		Set<Authority> auths = new HashSet<>();

		// 3. 根据所属角色解析权限
		while (role != null) {

			// 3.1 根据角色解析权限
			auths.addAll(parseAuthoritiesByRole(role.getId()));

			// 3.2 判断是否存在角色的继承
			if (role.getId() != role.getPid())
				// 3.2.1 若存在，将role更新为父角色，使循环得以继续
				role = roleDao.getRole(role.getPid());
			else
				// 3.2.2 若不存在，将role设为null，使循环能够跳出
				role = null;
		}

		return auths;
	}

	/**
	 * 根据角色id解析权限
	 * 
	 * @param rid
	 *            角色id
	 * @return 该角色所具有的权限
	 */
	private List<Authority> parseAuthoritiesByRole(String rid) {
		return roleAuthDao.listAuthoritiesByRoleId(rid);
	}

	@Override
	public Set<ModuleTree> parseModules(String uid) {
		// 1. 获取当前用户所属的角色
		Role role = parseRole(uid);

		// 2. 创建权限的集合
		Set<Module> modules = new TreeSet<>();

		// 3. 根据所属角色解析权限
		while (role != null) {

			// 3.1 根据角色解析权限
			modules.addAll(parseModulesByRole(role.getId()));

			// 3.2 判断是否存在角色的继承
			if (role.getId() != role.getPid())
				// 3.2.1 若存在，将role更新为父角色，使循环得以继续
				role = roleDao.getRole(role.getPid());
			else
				// 3.2.2 若不存在，将role设为null，使循环能够跳出
				role = null;
		}
		
		return ModuleTreeUtil.buildModuleForest(modules);
	}

	/**
	 * 根据角色id获取目录权限
	 * 
	 * @param rid
	 *            要解析目录权限的角色 id
	 * @return 指定角色所直接具有的目录权限
	 */
	private List<Module> parseModulesByRole(String rid) {
		return roleModuleDao.listModulesByRoleId(rid);
	}

	@Override
	public void grantRoleToUser(String userId, String roleId) {
		User u = userDao.getuser(userId);
		u.setRoleId(roleId);
		userDao.updateUser(u);
	}

	@Override
	public void revokeRoleFromUser(String userId, String roleId) {
		User u = userDao.getuser(userId);
		if(u.getRoleId().equals(roleId))
			u.setRoleId(null);
		userDao.updateUser(u);
	}

	@Override
	public boolean grantPriviledgesToRole(String roleId, String... privIds) {
		
		//1. 解除角色现有的权限
		roleAuthDao.removeAllAuthByRole(roleId);
		List<RoleAuth> ras = new ArrayList<>();
		
		//2. 为角色重新授权
		for(String privId : privIds) {
			RoleAuth roleAuth = new RoleAuth();
			roleAuth.setRoleId(roleId);
			roleAuth.setAuthId(privId);
			ras.add(roleAuth);
		}
		return roleAuthDao.batchSaveRoleAuth(ras) > 0;
	}

	@Override
	public boolean revokePriviledgesFromRole(String roleId, String... privIds) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean grantModulesToRole(String roleId, String... mdIds) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revokeModulesFromRole(String roleId, String... mdIds) {
		// TODO Auto-generated method stub
		return false;
	}

}
