package com.sunshine.model;
/**
 * 服务分类表
 * @author 陈晓锋
 *
 */
public class ServCategory {

	/*
	 * 服务分类id
	 */
	private String id;
	/*
	 * 服务分类名称
	 */
	private String name;
	/*
	 * 父分类id
	 */
	private String pid;
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
	@Override
	public String toString() {
		return "ServCategory [id=" + id + ", name=" + name + ", pid=" + pid + "]";
	} 
	
}
