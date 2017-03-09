package com.sunshine.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sunshine.dao.AuthorityDao;
import com.sunshine.dao.RoleDao;
import com.sunshine.model.Authority;
import com.sunshine.model.Module;
import com.sunshine.model.Role;
import com.sunshine.service.AuthorityService;

/**
 * AuthorityService 实现类
 * 
 * @author 云和数据-王辉
 *
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {

	private RoleDao roleDao;

	private AuthorityDao authorityDao;

	@Override
	public Role parseRole(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authority> parseAuthorities(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Module> parseModules(String uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean grantRoleToUser(String userId, String roleId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revokeRoleFromUser(String userId, String roleId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean grantPriviledgesToRole(String roleId, String... privIds) {
		// TODO Auto-generated method stub
		return false;
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
