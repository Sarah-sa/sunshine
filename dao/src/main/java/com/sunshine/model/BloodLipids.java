package com.sunshine.model;

import java.util.Date;

/**
 * 血脂表数据模型层 表名:t_blood_lopids
 * 
 * @author 云和数据-冯显胜
 *
 */
public class BloodLipids {
	/**
	 * 血脂表的编号
	 */
	private String id;
	/**
	 * 血脂值
	 */
	private Integer serumlipid;
	/**
	 * 测量血压日期
	 */
	private Date exam_time;
	/**
	 * 血脂
	 */
	private String status;
	/**
	 * 老人id
	 */
	private String elder_id;

	public BloodLipids() {

	}

	public BloodLipids(String id, Integer serumlipid, Date exam_time, String status, String elder_id) {
		super();
		this.id = id;
		this.serumlipid = serumlipid;
		this.exam_time = exam_time;
		this.status = status;
		this.elder_id = elder_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSerumlipid() {
		return serumlipid;
	}

	public void setSerumlipid(Integer serumlipid) {
		this.serumlipid = serumlipid;
	}

	public Date getExam_time() {
		return exam_time;
	}

	public void setExam_time(Date exam_time) {
		this.exam_time = exam_time;
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

}
