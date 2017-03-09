package com.sunshine.model;

/**
 * 兴趣表数据模型 表名:t_hobby
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Hobby {
	/**
	 * 兴趣表编号
	 */
	private String id;
	/**
	 * 兴趣名称
	 */
	private String name;

	public Hobby() {

	}

	public Hobby(String id, String name) {
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
