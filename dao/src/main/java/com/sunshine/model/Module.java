package com.sunshine.model;

/**
 *  菜单表 t_module
 *  添加Comparable<Module>接口 By 王辉
 * @author 云和数据-边晓鹏
 * @author 云和数据-王辉
 *
 */
public class Module implements Comparable<Module> {

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
	
	@Override
	public int compareTo(Module module) {
		if (module == null)
			return 1;
		return id.compareTo(module.getId());
	}
	
}
