package com.sunshine.model;

/**
 *  菜单表 t_module
 * @author 云和数据-边晓鹏
 *
 */
public class Module {

	//权限id
	private String id;
	//菜单名称
	private String name;
	//父菜单
	private String pid;
	//菜单图标url
	private String icon;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Module [id=" + id + ", name=" + name + ", pid=" + pid + ", icon=" + icon + "]";
	}
	
}
