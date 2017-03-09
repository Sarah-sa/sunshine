package com.sunshine.model;

import java.util.Date;

/**
 * 使用设备记录数据模型层 
 * 表t_equp_record
 * 
 * @author 云和数据-陈剑洲
 *
 */
public class Equipmentrecord {

	/**
	 * 此表id
	 */
	private String id;
	/**
	 * 设备id
	 */
	private String equp_id;
	/**
	 *  借出时间
	 */
	private Date lend_time;
	/**
	 * 归还时间
	 */
	private Date return_time; 
	/**
	 * 使用设备的老人id
	 */
	private String elder_id; 
	/**
	 * 借出者id
	 */
	private String user_id; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEqup_id() {
		return equp_id;
	}

	public void setEqup_id(String equp_id) {
		this.equp_id = equp_id;
	}

	public Date getLend_time() {
		return lend_time;
	}

	public void setLend_time(Date lend_time) {
		this.lend_time = lend_time;
	}

	public Date getReturn_time() {
		return return_time;
	}

	public void setReturn_time(Date return_time) {
		this.return_time = return_time;
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

	@Override
	public String toString() {
		return "Equipmentrecord [id=" + id + ", equp_id=" + equp_id + ", lend_time=" + lend_time + ", return_time="
				+ return_time + ", elder_id=" + elder_id + ", user_id=" + user_id + "]";
	}
	
	

}
