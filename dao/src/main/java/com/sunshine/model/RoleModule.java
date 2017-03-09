package com.sunshine.model;


/**
 * 角色菜单表 t_role_module
 * @author 云和数据-边晓鹏
 *
 */
public class RoleModule {

	//权限id
	private String id;
	//角色id
	private String roleId;
	//菜单id
	private String moduleId;
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
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	@Override
	public String toString() {
		return "RoleModule [id=" + id + ", roleId=" + roleId + ", moduleId=" + moduleId + "]";
	}
	
}
