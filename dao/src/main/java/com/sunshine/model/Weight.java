package com.sunshine.model;

import java.util.Date;

/**
 * 体重数据模型层 表名:t_weight
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Weight {
	/**
	 * 体重编号
	 */
	private String id;
	/**
	 * 体重
	 */
	private Double weight;
	/**
	 * 尿酸状态
	 */
	private String status;
	/**
	 * 身高
	 */
	private Double height;
	@Override
	public String toString() {
		return "Weight [id=" + id + ", weight=" + weight + ", status=" + status + ", height=" + height + ", exam_time="
				+ exam_time + ", elder_id=" + elder_id + "]";
	}

	/**
	 * 测量时间
	 */
	private Date exam_time;
	/**
	 * 老人ID
	 */
	private String elder_id;

	public Weight() {

	}

	public Weight(String id, Double weight, Date exam_time, String elder_id) {
		super();
		this.id = id;
		this.weight = weight;
		this.exam_time = exam_time;
		this.elder_id = elder_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
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
