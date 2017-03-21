package com.sunshine.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunshine.dao.RoleAuthDao;
import com.sunshine.dao.RoleDao;
import com.sunshine.dao.RoleModuleDao;
import com.sunshine.dao.UserDao;
import com.sunshine.model.Authority;
import com.sunshine.model.Module;
import com.sunshine.model.Role;
import com.sunshine.model.RoleAuth;
import com.sunshine.model.RoleModule;
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

	@Override
	public Set<Module> parseUserMenu(String pid) {
		
		//1. 创建目录集合
		Set<Module> modules = new TreeSet<>();
		
		//2. 解析当前登陆用户
		User user = getPrincipal();
		
		//3. 获取当前用户的直接继承角色
		Role role = parseRole(user.getId());
		
		//4. 自底向上遍历用户的角色链， 并获取角色链中所有的平级目录权限
		while (role != null) {

			// 4.1 根据角色解析目录
			modules.addAll(getMenu(role.getId(), pid));

			// 4.2 判断是否存在角色的继承
			if (role.getId() != role.getPid())
				// 4.2.1 若存在，将role更新为父角色，使循环得以继续
				role = roleDao.getRole(role.getPid());
			else
				// 4.2.2 若不存在，将role设为null，使循环能够跳出
				role = null;
		}
		
		//5. 返回查询结果
		return modules;
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
		if (u.getRoleId().equals(roleId))
			u.setRoleId(null);
		userDao.updateUser(u);
	}

	@Override
	public boolean grantPriviledgesToRole(String roleId, String... privIds) {

		// 1. 解除角色现有的权限
		roleAuthDao.removeAllAuthByRole(roleId);
		List<RoleAuth> ras = new ArrayList<>();

		// 2. 为角色重新授权
		for (String privId : privIds) {
			RoleAuth roleAuth = new RoleAuth();
			roleAuth.setRoleId(roleId);
			roleAuth.setAuthId(privId);
			ras.add(roleAuth);
		}
		return roleAuthDao.batchSaveRoleAuth(ras) > 0;
	}

	@Override
	public boolean grantModulesToRole(String roleId, String... mdIds) {
		// 1. 解除角色现有的所有目录权限
		roleModuleDao.removeAllModulesByRole(roleId);

		// 2. 创建 RoleModule 的集合
		List<RoleModule> rms = new ArrayList<>();

		for (String moduleId : mdIds) {
			RoleModule rm = new RoleModule();
			rm.setRoleId(roleId);
			rm.setModuleId(moduleId);
			rms.add(rm);
		}

		// 3. 批量授予目录权限
		return roleModuleDao.batchSaveRoleModule(rms) > 0;
	}

	@Override
	public Set<Role> listRoles(String uid) {
		// 1. 创建角色集合
		Set<Role> roles = new HashSet<>();

		// 2. 获取直接集成的角色
		Role role = parseRole(uid);

		// 3. 执行循环，自下而上的获取用户所拥有的所有角色，包括直接继承和间接继承，并逐个加入到角色的集合中，直到根角色为止
		while (role != null) {

			// 3.1 将角色加入到角色的集合中
			roles.add(role);

			// 3.2 判断当前角色是不是跟角色，若不是，获取父角色，若是，结束循环
			if (role.getPid() != null && role.getPid().equals(role.getId()))
				role = roleDao.getRole(role.getPid());
			else
				role = null;
		}

		// 4. 获取角色集合
		return roles;
	}

	@Override
	public Set<ModuleTree> parseModules() {
		User user = getPrincipal();
		if(user == null)
			return null;
		return parseModules(user.getId());
	}

	/**
	 * 获取当前登陆用户
	 * @return
	 */
	private User getPrincipal() {
		Subject sub = SecurityUtils.getSubject();
		Object obj = sub.getPrincipal();
		if(obj == null || !(obj instanceof User))
			return null;
		else
			return (User) obj;
	}
	
	/**
	 * 获取根目录或当前父目录的子目录
	 * @param rid 角色id
	 * @param pid 父目录id
	 * @return 对应的目录集合
	 */
	private List<Module> getMenu(String rid, String pid) {
		if (pid.equals("0"))
			return roleModuleDao.listRootModulesByRoleId(rid);
		else
			return roleModuleDao.listModulesByRoleIdAndPid(rid, pid);
	}
}
