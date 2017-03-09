package com.sunshine.model;

import java.util.Date;

/**
 * 说明：此类为 投诉模型，对应t_complain表 创建者：云和数据-陈晓峰 注释及修改： 王一贺 2017-03-08
 */
public class Complain {

	/**
	 * 投诉的id
	 */
	private String id;

	/**
	 * 投诉对应的订单id
	 */
	private String orderId;

	/**
	 * 投诉的内容
	 */
	private String content;

	/**
	 * 投诉的时间
	 */
	private Date createTime;

	/**
	 * 处理该投诉的坐席人员id
	 */
	private String staffId;

	/**
	 * 回访投诉人的时间
	 */
	private Date visitTime;

	/**
	 * 回访的结果
	 */
	private String visitResult;

	/**
	 * 投诉的处理状态，false为未回访，未处理；true为已处理。
	 */
	private Boolean status;

	// getter、setter方法
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public Date getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}

	public String getVisitResult() {
		return visitResult;
	}

	public void setVisitResult(String visitResult) {
		this.visitResult = visitResult;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	// 重写toString方法
	@Override
	public String toString() {
		return "Complain [id=" + id + ", orderId=" + orderId + ", content=" + content + ", createTime=" + createTime
				+ ", staffId=" + staffId + ", visitTime=" + visitTime + ", visitResult=" + visitResult + ", status="
				+ status + "]";
	}

}
