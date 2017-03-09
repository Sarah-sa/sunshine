package com.sunshine.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 文化生活-通知表 t_advice
 * 
 * @author 云和数据-边晓鹏
 *
 *         Administrator
 */
public class Advice {

	private String id;
	// 通知标题
	private String title;
	// 通知的描述
	private String description;
	// 开始时间
	private Timestamp startTime;
	// 结束时间
	private Timestamp endTime;
	// 事件地点
	private String location;
	// 通知发布时间
	private Timestamp publishTime;
	// 通知种类id
	private String adviceCtgyId;
	//发布人
	private String publisher;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Timestamp getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}
	public String getAdviceCtgyId() {
		return adviceCtgyId;
	}
	public void setAdviceCtgyId(String adviceCtgyId) {
		this.adviceCtgyId = adviceCtgyId;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Advice [id=" + id + ", title=" + title + ", description=" + description + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", location=" + location + ", publishTime=" + publishTime + ", adviceCtgyId="
				+ adviceCtgyId + ", publisher=" + publisher + "]";
	}
	
	
	

}
