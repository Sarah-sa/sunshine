package com.sunshine.model;

import java.util.Date;

public class VisitRecord {

	private String id;
	private String elderid;
	private String content;
	private String staffid;
	private Date createtime;
	private Date plantime;
	private Date exectime;
	private Boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getElderid() {
		return elderid;
	}
	public void setElderid(String elderid) {
		this.elderid = elderid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStaffid() {
		return staffid;
	}
	public void setStaffid(String staffid) {
		this.staffid = staffid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Date getPlantime() {
		return plantime;
	}
	public void setPlantime(Date plantime) {
		this.plantime = plantime;
	}
	public Date getExectime() {
		return exectime;
	}
	public void setExectime(Date exectime) {
		this.exectime = exectime;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "VisitRecord [id=" + id + ", elderid=" + elderid + ", content=" + content + ", staffid=" + staffid
				+ ", createtime=" + createtime + ", plantime=" + plantime + ", exectime=" + exectime + ", status="
				+ status + "]";
	}
	
}
