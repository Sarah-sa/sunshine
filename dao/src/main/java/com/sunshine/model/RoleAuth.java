package com.sunshine.model;

/**
 *  角色权限表 t_role_auth
 * @author 云和数据-边晓鹏
 *
 */
public class RoleAuth {

	//权限角色映射id
	private String id;
	//角色id
	private String roleId;
	//权限id
	private String authId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	@Override
	public String toString() {
		return "RoleAuth [id=" + id + ", roleId=" + roleId + ", authId=" + authId + "]";
	}
	
	
}
