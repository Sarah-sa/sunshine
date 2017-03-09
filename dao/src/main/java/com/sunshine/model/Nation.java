package com.sunshine.model;

/**
 * 民族代表数据模型层 表名:t_nation
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Nation {
	/**
	 * 民族ID
	 */
	private String id;
	/**
	 * 民族名字
	 */
	private String name;

	public Nation() {

	}

	public Nation(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
