package com.sunshine.model;

import java.util.Date;

/**
 * 志愿者数据模型层
 * 表t_vol_activity
 * 
 * @author 云和数据-陈剑洲
 */
public class Volunteeractivity {

	/**
	 * 此表id
	 */
	private String id;// 
	/**
	 * 志愿者id
	 */
	private String vol_id;// 
	/**
	 * 服务描述
	 */
	private String svr_description; 
	/**
	 * 服务的时间
	 */
	private Date svr_time; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVol_id() {
		return vol_id;
	}

	public void setVol_id(String vol_id) {
		this.vol_id = vol_id;
	}

	public String getSvr_description() {
		return svr_description;
	}

	public void setSvr_description(String svr_description) {
		this.svr_description = svr_description;
	}

	public Date getSvr_time() {
		return svr_time;
	}

	public void setSvr_time(Date svr_time) {
		this.svr_time = svr_time;
	}

	@Override
	public String toString() {
		return "Volunteeractivity [id=" + id + ", vol_id=" + vol_id + ", svr_description=" + svr_description
				+ ", svr_time=" + svr_time + "]";
	}
	
	

}
