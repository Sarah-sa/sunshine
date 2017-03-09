package com.sunshine.model;

/**
 * 帮扶等级数据模型层 表名:t_need_degree
 * 
 * @author 云和数据-冯显胜
 *
 */
public class NeedDegree {
	/**
	 * 编号
	 */
	private String id;

	/**
	 * 帮扶需求程度
	 */
	private String name;
	/**
	 * 等级
	 */
	private Integer degree;

	public NeedDegree() {

	}

	public NeedDegree(String id, String name, Integer degree) {
		super();
		this.id = id;
		this.name = name;
		this.degree = degree;
	}

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

	public Integer getDegree() {
		return degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

}
