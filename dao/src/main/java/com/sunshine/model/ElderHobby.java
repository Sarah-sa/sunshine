package com.sunshine.model;

/**
 * 老人兴趣表数据模型层 表名：t_elder_hobby
 * 
 * @author 云和数据-冯显胜
 *
 */
public class ElderHobby {
	/**
	 * 老人兴趣表编号
	 */
	private String id;
	/**
	 * 老人编号
	 */
	private String elder_id;
	/**
	 * 兴趣表编号
	 */
	private String hobby_id;

	public ElderHobby() {

	}

	public ElderHobby(String id, String elder_id, String hobby_id) {
		super();
		this.id = id;
		this.elder_id = elder_id;
		this.hobby_id = hobby_id;
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

	public String getHobby_id() {
		return hobby_id;
	}

	public void setHobby_id(String hobby_id) {
		this.hobby_id = hobby_id;
	}

}
