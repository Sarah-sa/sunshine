package com.sunshine.model;

/**
 * 老人用戶数据模型层 表名:t_elder_user
 * 
 * @author 云和数据-冯显胜
 */
public class ElderUser {
	/**
	 * 老人用户id
	 */
	private String id;
	/**
	 * 老人id
	 */
	private String elder_id;
	/**
	 * 用户id
	 */
	private String user_id;
	/**
	 * 老人与用户的关系
	 */
	private String relation;

	public ElderUser() {

	}

	public ElderUser(String id, String elder_id, String user_id, String relation) {
		super();
		this.id = id;
		this.elder_id = elder_id;
		this.user_id = user_id;
		this.relation = relation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getElder_id() {
		return elder_id;
	}

	public void setElder_id(String elder_id) {
		this.elder_id = elder_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

}
