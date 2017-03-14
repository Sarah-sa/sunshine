package com.sunshine.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 文化生活-活动表 t_activity
 * 
 * @author 云和数据-任继鹏 Administrator
 */
public class Activity {
	// 活动编号
	private String id;
	// 活动名称
	private String name;
	// 活动详情
	private String details;
	// 活动图片
	private String picture;
	// 活动意义
	private String sense;
	// 开始时间
	private Timestamp dateStart;
	// 结束时间
	private Date dateEnd;
	
	private Date time;
	public String getId() {
		return id;
	}
	public Date getDateEnd() {
		return dateEnd;
	}


	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}


	public Date getTime() {
		return time;
	}


	public void setTime(Date time) {
		this.time = time;
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getSense() {
		return sense;
	}

	public void setSense(String sense) {
		this.sense = sense;
	}

	public Timestamp getDateStart() {
		return dateStart;
	}

	public void setDateStart(Timestamp dateStart) {
		this.dateStart = dateStart;
	}
	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + ", details=" + details + ", picture=" + picture + ", sense="
				+ sense + ", dateStart=" + dateStart + ", dateEnd=" + dateEnd + ", time=" + time + "]";
	}

	

}
