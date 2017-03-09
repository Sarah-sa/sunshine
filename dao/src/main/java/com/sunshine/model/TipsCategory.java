package com.sunshine.model;
/**
 * 知识库种类表数据模型
 * 表t_tips_category
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class TipsCategory {

	/**
	 * 种类表
	 */
	private String id;
	/**
	 * 种类名称
	 */
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
		return "TipsCategory [id=" + id + ", name=" + name + "]";
	}

}
