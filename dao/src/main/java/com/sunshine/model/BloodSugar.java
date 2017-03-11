package com.sunshine.model;

import java.util.Date;

/**
 * 血糖表数据模型层 表名：t_blood_sugar
 * 
 * @author 云和数据-冯显胜
 *
 */
public class BloodSugar {
	/**
	 * 血糖表编号
	 */
	private String id;
	/**
	 * 血糖值
	 */
	private Integer bloodglucose;
	/**
	 * 血糖状态
	 */
	private String status;
	/**
	 * 
	 * 老人id
	 */
	private String elder_id;
	private Date exam_time;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getBloodglucose() {
		return bloodglucose;
	}
	public void setBloodglucose(Integer bloodglucose) {
		this.bloodglucose = bloodglucose;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getElder_id() {
		return elder_id;
	}
	public void setElder_id(String elder_id) {
		this.elder_id = elder_id;
	}
	public Date getExam_time() {
		return exam_time;
	}
	public void setExam_time(Date exam_time) {
		this.exam_time = exam_time;
	}
	@Override
	public String toString() {
		return "BloodSugar [id=" + id + ", bloodglucose=" + bloodglucose + ", status=" + status + ", elder_id="
				+ elder_id + ", exam_time=" + exam_time + "]";
	}

	
}
