package com.sunshine.model;

import java.util.Date;

/**
 * 老人入驻平台申请表数据模型层 表名:t_elder_requestion
 * 
 * @author 云和数据-冯显胜
 *
 */
public class ElderRquestion {
	/**
	 * 申请表编号
	 */
	private String id;
	/**
	 * 老人姓名
	 */
	private String elder_name;
	/**
	 * 用户id
	 */
	private String user_id;
	/**
	 * 申请的时间
	 */
	private Date createtime;
	/**
	 * 申请处理的状态
	 */
	private String status;

	public ElderRquestion() {

	}

	public ElderRquestion(String id, String elder_name, String user_id, Date createtime, String status) {
		super();
		this.id = id;
		this.elder_name = elder_name;
		this.user_id = user_id;
		this.createtime = createtime;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getElder_name() {
		return elder_name;
	}

	public void setElder_name(String elder_name) {
		this.elder_name = elder_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
