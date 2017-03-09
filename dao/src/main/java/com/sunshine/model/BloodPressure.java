package com.sunshine.model;

import java.util.Date;

/**
 * 血压表数据模型 表名：t_blood_pressure
 * 
 * @author 云和数据-冯显胜
 *
 */
public class BloodPressure {
	/**
	 * 血压表编号
	 */
	private String id;
	/**
	 * 高压
	 */
	private Integer highpressure;
	/**
	 * 低压
	 */
	private Integer lowpressure;
	/**
	 * 血压状态
	 */
	private String status;
	/**
	 * 脉率
	 */
	private Integer pr;
	/**
	 * 测量血压日期
	 */
	private Date exam_time;
	/**
	 * 老人id
	 */
	private String elder_id;

	public BloodPressure() {

	}

	public BloodPressure(String id, Integer highpressure, Integer lowpressure, String status, Integer pr,
			Date exam_time, String elder_id) {
		super();
		this.id = id;
		this.highpressure = highpressure;
		this.lowpressure = lowpressure;
		this.status = status;
		this.pr = pr;
		this.exam_time = exam_time;
		this.elder_id = elder_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getHighpressure() {
		return highpressure;
	}

	public void setHighpressure(Integer highpressure) {
		this.highpressure = highpressure;
	}

	public Integer getLowpressure() {
		return lowpressure;
	}

	public void setLowpressure(Integer lowpressure) {
		this.lowpressure = lowpressure;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPr() {
		return pr;
	}

	public void setPr(Integer pr) {
		this.pr = pr;
	}

	public Date getExam_time() {
		return exam_time;
	}

	public void setExam_time(Date exam_time) {
		this.exam_time = exam_time;
	}

	public String getElder_id() {
		return elder_id;
	}

	public void setElder_id(String elder_id) {
		this.elder_id = elder_id;
	}

}
