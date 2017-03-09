package com.sunshine.model;

import java.util.Date;

/**
 * 短信记录数据模型层 
 * 表t_msg_record
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class MsgRecord {

	/**
	 * 此表id
	 */
	private String id;
	/**
	 * 收信人
	 */
	private String user_id;
	/**
	 * 发送时间
	 */
	private Date send_time;
	/**
	 * 短信内容
	 */
	private String content;
	/**
	 * 是否发送成功
	 */
	private Boolean status;
	/**
	 * 坐席人员id
	 */
	private String staff_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Date getSend_time() {
		return send_time;
	}

	public void setSend_time(Date send_time) {
		this.send_time = send_time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	@Override
	public String toString() {
		return "MsgRecord [id=" + id + ", user_id=" + user_id + ", send_time=" + send_time + ", content=" + content
				+ ", status=" + status + ", staff_id=" + staff_id + "]";
	}

}
