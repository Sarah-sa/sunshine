package com.sunshine.model;

/**
 *  角色表 t_role
 * @author 云和数据-边晓鹏
 *
 */
public class Role {

	//角色id
	private String id;
	//角色名字
	private String roleName;
	//父角色id
	private String pid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", pid=" + pid + "]";
	}
	
	
}
