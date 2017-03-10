package com.sunshine.model;

import java.util.Date;

/**
 * 尿酸数据模型层 表名:t_uric_acaid
 * 
 * @author 云和数据-冯显胜
 *
 */
public class UricAcaid {
	/**
	 * 尿酸编号
	 */
	private String id;
	@Override
	public String toString() {
		return "UricAcaid [id=" + id + ", priceuric=" + priceuric + ", exam_time=" + exam_time + ", status=" + status
				+ ", elder_id=" + elder_id + "]";
	}

	/**
	 * 尿酸值
	 */
	private Integer priceuric;
	/**
	 * 检查尿酸日期
	 */
	private Date exam_time;
	/**
	 * 尿酸状态
	 */
	private String status;
	/**
	 * 老人id
	 */
	private String elder_id;

	public UricAcaid() {

	}

	public UricAcaid(String id, Integer priceuric, Date exam_time, String status, String elder_id) {
		super();
		this.id = id;
		this.priceuric = priceuric;
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

	public Integer getPriceuric() {
		return priceuric;
	}

	public void setPriceuric(Integer priceuric) {
		this.priceuric = priceuric;
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
