package com.sunshine.model;

import java.sql.Time;
import java.util.Date;

/**
 * 居家安全-告警白名单表 t_alarm_whitelist
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public class AlarmWhitelist {
	
	
	//告警白名单id
	private String id;
	//用户id
	private String userId;
	//电话号码
	private String phone;
	//告警开始时间
	private Time startTime;
	//告警结束时间
	private Time endTime;
	//告警间隔
	private int interval;
	//流量id
	private int fluxUnitId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	public int getFluxUnitId() {
		return fluxUnitId;
	}
	public void setFluxUnitId(int fluxUnitId) {
		this.fluxUnitId = fluxUnitId;
	}
	@Override
	public String toString() {
		return "AlarmWhitelist [id=" + id + ", userId=" + userId + ", phone=" + phone + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", interval=" + interval + ", fluxUnitId=" + fluxUnitId + "]";
	}
	
	
	
	
	
}
