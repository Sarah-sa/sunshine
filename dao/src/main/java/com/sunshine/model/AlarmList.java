package com.sunshine.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *居家安全- 居家安全告警列表 t_alarm_list
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public class AlarmList {

	//告警列表id
	private String id;
	//关联的老人id
	private String elderId;
	//告警内容
	private String content;
	//发送告警时间
	private Timestamp sentTime;
	//告警区域
	private String area;
	//告警的设备
	private String equipmentId;
	//处理的状态
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getElderId() {
		return elderId;
	}
	public void setElderId(String elderId) {
		this.elderId = elderId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getSentTime() {
		return sentTime;
	}
	public void setSentTime(Timestamp sentTime) {
		this.sentTime = sentTime;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "AlarmList [id=" + id + ", elderId=" + elderId + ", content=" + content + ", sentTime=" + sentTime
				+ ", area=" + area + ", equipmentId=" + equipmentId + ", status=" + status + "]";
	}
	
}
