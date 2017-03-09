package com.sunshine.model;

/**
 * 设备种类表数据模型层 
 * 表t_equp_category
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class Equipmentcategory {

	/**
	 * 设备种类id
	 */
	private String id; 
	/**
	 * 父种类
	 */
	private String pid; 
	/**
	 * 种类名
	 */
	private String name; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Equipmentcategory [id=" + id + ", pid=" + pid + ", name=" + name + "]";
	}
	
	

}
