package com.sunshine.model;

/**
 * 
 *  系统管理员表 t_admin
 * @author 云和数据-边晓鹏
 *
 */
public class Admin {

	//权限id
	private String id;
	//管理员名称
	private String name;
	//管理员密码
	private String pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
	
}
