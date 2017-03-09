package com.sunshine.model;

import java.util.Date;
/**
 * 知识库数据模型层
 * 表t_tips
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class LoginRecord {

	/**
	 * 此表id
	 */
	private String id;
	/**
	 * 坐席人员id
	 */
	private String staff_id;
	/**
	 * ip地址
	 */
	private String ip_address;
	/**
	 * 登录时间
	 */
	private Date login_time;
	/**
	 * 登出时间
	 */
	private Date logout_time;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	public Date getLogout_time() {
		return logout_time;
	}

	public void setLogout_time(Date logout_time) {
		this.logout_time = logout_time;
	}

	@Override
	public String toString() {
		return "LoginRecord [id=" + id + ", staff_id=" + staff_id + ", ip_address=" + ip_address + ", login_time="
				+ login_time + ", logout_time=" + logout_time + "]";
	}

}