package com.sunshine.model;

import java.util.Date;

/**
 * 走访记录模型，对应表t_visit_record
 * 作者：陈晓峰
 * 修改者： 王一贺 
 * 修改时间：2017-03-07
 */
public class VisitRecord {

	/**
	 * 走访记录的id
	 */
	private String id;
	
	/**
	 * 被走访的老人id
	 */
	private String elderId;
	
	/**
	 * 走访的内容
	 */
	private String content;
	
	/**
	 * 发起此次走访的坐席人员的id
	 */
	private String staffId;
	
	/**
	 *创建‘走访计划’的的时间 
	 */
	private Date createTime;	
	
	/**
	 * 走访的原计划时间
	 */
	private Date planTime;
	
	/**
	 *走访的实际执行时间 
	 */
	private Date execTime;
	
	/**
	 * 走访是否完成的状态：
	 * true为已走访；false为未走访
	 */
	private Boolean status;
	
	//以下为getter、setter方法
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
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getPlanTime() {
		return planTime;
	}
	public void setPlanTime(Date planTime) {
		this.planTime = planTime;
	}
	public Date getExecTime() {
		return execTime;
	}
	public void setExecTime(Date execTime) {
		this.execTime = execTime;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	//重写toString（）方法
	@Override
	public String toString() {
		return "VisitRecord [id=" + id + ", elderId=" + elderId + ", content=" + content + ", staffId=" + staffId
				+ ", createTime=" + createTime + ", planTime=" + planTime + ", execTime=" + execTime + ", status="
				+ status + "]";
	}	
}
