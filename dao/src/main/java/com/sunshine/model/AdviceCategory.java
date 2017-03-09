package com.sunshine.model;
/**
 * 文化生活-通知分类表 t_advice_category
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public class AdviceCategory {

	//通知分类id
	private String id;
	//分类名
	private String name;
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
	@Override
	public String toString() {
		return "AdviceCategory [id=" + id + ", name=" + name + "]";
	}
	
}
