package com.sunshine.model;

import java.util.Date;

/**
 * 计步表数据模型层 表名:t_Steps
 * 
 * @author 云和数据-冯显胜
 *
 */
public class Steps {
	/**
	 * 计步id
	 */
	private String id;
	/**
	 * 运动距离
	 */
	private Double distance;
	/**
	 * 计步值
	 */
	private Integer steps;
	/**
	 * 燃烧热量
	 */
	private Double calorie;
	/**
	 * 运动的日期
	 */
	private Date upload_date;
	/**
	 * 老人id
	 */
	private String elder_id;

	public Steps() {

	}

	public Steps(String id, Double distance, Integer steps, Double calorie, Date upload_date, String elder_id) {
		super();
		this.id = id;
		this.distance = distance;
		this.steps = steps;
		this.calorie = calorie;
		this.upload_date = upload_date;
		this.elder_id = elder_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	public Double getCalorie() {
		return calorie;
	}

	public void setCalorie(Double calorie) {
		this.calorie = calorie;
	}

	public Date getUpload_date() {
		return upload_date;
	}

	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}

	public String getElder_id() {
		return elder_id;
	}

	public void setElder_id(String elder_id) {
		this.elder_id = elder_id;
	}

}
