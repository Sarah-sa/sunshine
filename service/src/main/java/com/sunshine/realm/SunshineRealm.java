package com.sunshine.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sunshine.dao.StaffInfoDao;
import com.sunshine.dao.UserDao;
import com.sunshine.exception.CredentialExpiredException;
import com.sunshine.model.Authority;
import com.sunshine.model.Role;
import com.sunshine.model.StaffInfo;
import com.sunshine.model.User;
import com.sunshine.service.AuthorityService;
import com.sunshine.util.EncryptUtil;

/**
 * 自定义 realm，用以身份验证及权限验证
 * 
 * @author 云和数据-王辉
 *
 */
public class SunshineRealm extends AuthorizingRealm {

	@Autowired
	private AuthorityService authorityService;

	@Autowired
	private UserDao userDao;

	@Autowired
	private StaffInfoDao infoDao;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Object principal = principals.getPrimaryPrincipal();
		User user = (User) principal;
		if (user == null)
			return null;
		Set<Authority> auths = authorityService.parseAuthorities(user.getId());
		// raDao.listAuthoritiesByRoleId(user.getRoleId());
		Set<Role> roleList = authorityService.listRoles(user.getId());

		Set<String> roles = new HashSet<>();
		for (Role role : roleList) {
			roles.add(role.getRoleName());
		}

		Set<String> permissions = new HashSet<>();
		for (Authority authority : auths) {
			permissions.add(authority.getId());
		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		info.addStringPermissions(permissions);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		String userName = usernamePasswordToken.getUsername();
		User user = userDao.getByUserName(userName);
		StaffInfo staffInfo = infoDao.getStaff(user.getId());
		if(staffInfo != null && !staffInfo.getStatus())
			throw new CredentialExpiredException();
		if (user == null)
			throw new UnknownAccountException(userName + " is unknown");

		ByteSource salt = ByteSource.Util.bytes(userName);
		return new SimpleAuthenticationInfo(user, user.getPwd(), salt, getName());
	}

}
