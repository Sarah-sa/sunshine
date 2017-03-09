package com.sunshine.model;

/**
 * 婚姻表数据模型层 表名:t_nation
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Marriage {
	/**
	 * 婚姻状况id;
	 */
	private String id;
	/**
	 * 状况名称
	 */
	private String name;

	public Marriage() {

	}

	public Marriage(String id, String name) {
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
